package com.onfacemind.batchimportfiles.util.http;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

public class HttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    private static final int POOL_SIZE = 30;
    private static final int CONNET_TIMEOUT = 3*1000;
    private static final int SOCKET_TIMEOUT = 30*1000;
    private static final int CONNET_REQUEST_TIMEOUT = 1000;

    private static CloseableHttpClient httpClient;

    static {
        //设置连接池，并静态初始化httpClient，由于httpClient是线程安全的，所以全局共享一个
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(POOL_SIZE);
        connectionManager.setDefaultMaxPerRoute(connectionManager.getMaxTotal());
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(CONNET_TIMEOUT)
                .setSocketTimeout(SOCKET_TIMEOUT)
                .setConnectionRequestTimeout(CONNET_REQUEST_TIMEOUT)
                .build();
        httpClient = HttpClients.custom()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(config)
                .build();
    }

    public static <T> T post(String url,
                             Map<String,String> params,
                             Map<String,File> files,
                             Map<String,MultipartFile> multiFiles,
                             Map<String,byte[]> bytesFiles,
                             Class<T> clazz){

        try {
            HttpPost httpPost = new HttpPost(url);

            MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
            if (params != null && params.size() > 0){
                params.forEach((key,value) -> entityBuilder.addPart(key,new StringBody(value, ContentType.TEXT_PLAIN)));
            }

            if (files != null && files.size() > 0){
                files.forEach((key,file) -> entityBuilder.addPart(key,new FileBody(file)));
            }

            if (multiFiles != null && multiFiles.size() > 0){
                multiFiles.forEach((key,value) -> {
                    try {
                        entityBuilder.addPart(key,new ByteArrayBody(value.getBytes(),value.getName()));
                    } catch (IOException e) {
                        e.printStackTrace();
                        logger.error("发送HTTP请求失败：",e);
                    }
                });
            }

            if (bytesFiles != null && bytesFiles.size() > 0){
                bytesFiles.forEach((key,file) -> entityBuilder.addBinaryBody(key,file));
            }

            httpPost.setEntity(entityBuilder.build());
            CloseableHttpResponse response = httpClient.execute(httpPost);

            try {
                StatusLine statusLine = response.getStatusLine();
                logger.debug("调用HTTP接口返回状态码："+statusLine.toString());
                if (statusLine.getStatusCode() == HttpStatus.SC_OK){
                    String result = EntityUtils.toString(response.getEntity());
                    logger.debug("调用HTTP接口返回结果："+result);
                    if (StringUtils.isNotEmpty(result))
                        return JSON.parseObject(result, clazz);
                }
            } catch (IOException e) {
                e.printStackTrace();
                logger.error("发送HTTP请求失败：",e);
            } finally {
                response.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("发送HTTP请求失败：",e);
        }
        return null;
    }

    public static <T> T postJson(String url, Object obj,Class<T> clazz){

        try {
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Content-type","application/json; charset=utf-8");
            httpPost.setHeader("Accept", "application/json");
            StringEntity stringEntity = new StringEntity(JSON.toJSONString(obj), Charset.forName("UTF-8"));

            httpPost.setEntity(stringEntity);
            CloseableHttpResponse response = httpClient.execute(httpPost);

            try {
                StatusLine statusLine = response.getStatusLine();
                logger.debug("调用HTTP接口返回状态码："+statusLine.toString());
                if (statusLine.getStatusCode() == HttpStatus.SC_OK){
                    String result = EntityUtils.toString(response.getEntity());
                    logger.debug("调用HTTP接口返回结果："+result);
                    if (StringUtils.isNotEmpty(result))
                        return JSON.parseObject(result, clazz);
                }
            } catch (IOException e) {
                e.printStackTrace();
                logger.error("发送HTTP请求失败：",e);
            } finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("发送HTTP请求失败：",e);
        }
        return null;
    }


    public static <T> T get(String url,Class<T> clazz){

        try {
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            try {
                StatusLine statusLine = response.getStatusLine();
                logger.debug("调用HTTP接口返回状态码："+statusLine.toString());

                if (statusLine.getStatusCode() == HttpStatus.SC_OK){
                    String result = EntityUtils.toString(response.getEntity());
                    logger.debug("调用HTTP接口返回结果："+result);
                    if (StringUtils.isNotEmpty(result))
                        return JSON.parseObject(result, clazz);
                }
            } catch (IOException e) {
                e.printStackTrace();
                logger.error("发送HTTP请求失败：",e);
            } finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("发送HTTP请求失败：",e);
        }
        return null;
    }

}

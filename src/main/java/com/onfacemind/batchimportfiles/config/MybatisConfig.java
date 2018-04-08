package com.onfacemind.batchimportfiles.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = {"com.onfacemind.batchimportorcl.write.mapper"}, sqlSessionFactoryRef = "sqlSessionFactoryWrite")
public class MybatisConfig {

    @Autowired
    @Qualifier("writeDataSource")
    private DataSource writeDataSource;


    @Bean
    public SqlSessionFactory sqlSessionFactoryWrite() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(writeDataSource); // 使用titan数据源, 连接titan库

        return factoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateWrite() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryWrite()); // 使用上面配置的Factory
        return template;
    }

}

package com.onfacemind.batchimportfiles.compare.beans;

import java.util.List;

/**
 * 根据人脸照片搜索人脸库比对返回结果对象
 * @author 黄彬
 *
 */
public class FaceSearchResponse extends BaseCompareResponse{

	private List<FaceSearchData> data;
	
	private Integer totalsize;

	public List<FaceSearchData> getData() {
		return data;
	}

	public void setData(List<FaceSearchData> data) {
		this.data = data;
	}

	public Integer getTotalsize() {
		return totalsize;
	}

	public void setTotalsize(Integer totalsize) {
		this.totalsize = totalsize;
	}
	
}

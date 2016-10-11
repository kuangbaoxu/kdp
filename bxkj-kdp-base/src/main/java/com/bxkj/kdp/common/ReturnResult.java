package com.bxkj.kdp.common;

public class ReturnResult {
	/**
	 * 0：失败  1：成功
	 */
    int statusFlag;
    String resultMsg;
    
	public int getStatusFlag() {
		return statusFlag;
	}
	
	public void setStatusFlag(int statusFlag) {
		this.statusFlag = statusFlag;
	}
	
	public String getResultMsg() {
		return resultMsg;
	}
	
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public ReturnResult(int statusFlag, String resultMsg) {
		this.statusFlag = statusFlag;
		this.resultMsg = resultMsg;
	}
}

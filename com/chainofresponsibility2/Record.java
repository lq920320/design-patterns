package com.chainofresponsibility2;
/**
 * 需要审批的单据
 * @author liuqian
 *
 */
public class Record {

	/**
	 * 表示各个职位的人是否已经签字
	 */
	private boolean managerSign;
	private boolean ceoSign;
	private boolean cfoSign;
	
	public boolean isManagerSign() {
		return managerSign;
	}
	public void setManagerSign(boolean managerSign) {
		this.managerSign = managerSign;
	}
	public boolean isCeoSign() {
		return ceoSign;
	}
	public void setCeoSign(boolean ceoSign) {
		this.ceoSign = ceoSign;
	}
	public boolean isCfoSign() {
		return cfoSign;
	}
	public void setCfoSign(boolean cfoSign) {
		this.cfoSign = cfoSign;
	}
	
	
}

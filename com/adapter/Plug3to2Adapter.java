package com.adapter;
/**
 * 电源插头3转2适配器
 * @author liuiqian
 *
 */
public class Plug3to2Adapter implements INoEarthWirePlug {

	//源接口
	private IWithEarthWirePlug adaptee;
	
	//实现
	@Override
	public void plug(String liveWire, String nullWire) {
		// TODO Auto-generated method stub
		adaptee.plug("火线", "零线", null);
	}
	
	//构造方法
	public Plug3to2Adapter(IWithEarthWirePlug adaptee) {
		this.adaptee = adaptee;
	}

}

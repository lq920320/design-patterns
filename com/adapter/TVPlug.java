package com.adapter;
/**
 * 电视机的带接地插头源类
 * @author liuiqian
 *
 */
public class TVPlug implements IWithEarthWirePlug {

	@Override
	public void plug(String liveWire, String nullWire, String earthWire) {
		// TODO Auto-generated method stub
		play();
	}
	
	//工作方法
	private void play(){
		System.out.println("播放电视节目");
	}

}

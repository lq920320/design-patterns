package com.adapter;

/**
 * 带接地线的插头
 * @author liuiqian
 *
 */
public interface IWithEarthWirePlug {

	/**
	 * 
	 * @param liveWire 火线
	 * @param nullWire 零线
	 * @param earthWire 地线
	 */
	public void plug(String liveWire, String nullWire, String earthWire);
}

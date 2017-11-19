package com.adapter;
/**
 * 不接地线的两相插头
 * @author liuiqian
 *
 */
public interface INoEarthWirePlug {

	/**
	 * @param liveWire火线
	 * @param nullWire零线
	 */
	public void plug(String liveWire, String nullWire);
}

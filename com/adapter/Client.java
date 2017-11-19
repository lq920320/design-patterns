package com.adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//客户端接口，使用适配器对源类进行转换
		INoEarthWirePlug plug = new Plug3to2Adapter(new TVPlug());
		//插上插头
		plug.plug("火线", "零线");
	}

}

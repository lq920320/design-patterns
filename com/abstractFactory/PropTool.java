package com.abstractFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * 解析properties文件的工具类
 * @author liuiqian
 *
 */
public class PropTool {
	private static Properties prop;
	private static final String filePath = "/conf/config.properties";
	
	public synchronized static String getProoperty(String key) {
		if (prop == null) {
			/**
			 * 创建配置对象
			 */
			prop = new Properties();
			try {
				prop.load(PropTool.class.getResourceAsStream(filePath));
			} catch (IOException e){
				System.out.println(filePath + " 解析失败！");
			}
		}
		return prop.getProperty(key);
	}
}

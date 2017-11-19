package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式的工厂方法
 * 
 * @author liuqian
 * 
 */
public class CharFlyweightFactory {
	/**
	 * Flyweight对象缓存池
	 */
	private static Map<Character, CharFlyweight> charMap = new HashMap<>();

	public synchronized static CharFlyweight getCharFlyweight(char c) {
		/**
		 * 查看对象是否存在
		 */
		if(charMap.containsKey(c)){
			//存在此对象则直接使用原有的对象
			return charMap.get(c);
		} else {
			//不存在则生成新的对象
			CharFlyweight charFlyweight = new EnglishCharacter(c);
			//存入集合中
			charMap.put(c, charFlyweight);
			return charFlyweight;
		}
	}
	
	/**
	 * 显示Flyweight对象缓存池状态
	 */
	public static void showStatus(){
		System.out.print("flyweight对象数量：" + charMap.size() + "字符列表：");
		for(Map.Entry<Character, CharFlyweight> entry : charMap.entrySet()){
			System.out.print(entry.getKey() + "  ");
		}
		System.out.println();
	}
}

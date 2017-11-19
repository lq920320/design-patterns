package com.flyweight;

import java.awt.Font;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 享元模式的工厂模式
 * 
 * @author liuqian
 * 
 */
public class PosterElementFactory {
	/**
	 * 单例模式
	 */
	private static PosterElementFactory fac;

	/**
	 * 单例模式实例获取方法
	 */
	public synchronized static PosterElementFactory getFactory() {
		if (fac == null) {
			fac = new PosterElementFactory();
		}
		return fac;
	}

	/**
	 * 单例模式构造方法
	 */
	private PosterElementFactory() {
	}

	/**
	 * 享元元素的类型
	 */
	public static final String ElementType_Charactor = "Charactor";
	public static final String ElementType_Image = "Image";
	/**
	 * Flyweight对象缓存池
	 */
	private Map<String, Map<Object, PosterElementFlyweight>> fwMap = new HashMap<>();

	/**
	 * font对象缓存池
	 */
	private Set<Font> fontSet = new HashSet<>();

	/**
	 * 获取字体对象
	 */
	public synchronized Font getFont(Font font) {
		/**
		 * 查看对象是否已存在
		 */
		if (fontSet.contains(font)) {
			// 存在此对象则直接使用原有对象
			for (Font f : fontSet) {
				if (f.equals(font)) {
					return f;
				}
			}
		} else {
			// 不存在此对象则存入此对象
			fontSet.add(font);
		}
		return font;
	}

	/**
	 * 获取一个享元对象
	 * 
	 * @param ElementType
	 * @param key
	 * @return
	 */
	public synchronized PosterElementFlyweight getFw(String ElementType,
			Object key) {
		// 查看此对象是否已存在
		if (fwMap.get(ElementType).containsKey(key)) {
			// 存在此对象则直接使用原有对象
			return fwMap.get(ElementType).get(key);
		} else {
			// 不存在此对象则生成新对象
			PosterElementFlyweight fwObj = null;
			if (PosterElementFactory.ElementType_Charactor.equals(ElementType)) {
				fwObj = new FwChar((Character) key);
			} else if (PosterElementFactory.ElementType_Image
					.equals(ElementType)) {
				fwObj = new FwImage((String) key);
			} else {
				throw new RuntimeException("不支持此类对象！");
			}
			// 存入集合中
			fwMap.get(ElementType).put(key, fwObj);
			return fwObj;
		}

	}

	/**
	 * 创建非享元对象
	 * 
	 * @param ElementType
	 * @param str
	 * @return
	 */
	public synchronized FwPoster getPoster(String ElementType, String str) {
		if (fwMap.get(ElementType) == null) {
			fwMap.put(ElementType,
					new HashMap<Object, PosterElementFlyweight>());
		}

		FwPoster fwPoster = new FwPoster();
		if (PosterElementFactory.ElementType_Charactor.equals(ElementType)) {
			for (int i = 0; i < str.length(); i++) {
				fwPoster.getElist().add(
						getFw(PosterElementFactory.ElementType_Charactor,
								str.charAt(i)));
			}
		} else if (PosterElementFactory.ElementType_Image.equals(ElementType)) {
			fwPoster.getElist().add(
					getFw(PosterElementFactory.ElementType_Image, str));
		} else {
			throw new RuntimeException("不支持此类对象！");
		}
		return fwPoster;
	}

	/**
	 * 显示Flyweight对象缓存池状态
	 */
	public void showStatus() {
		if (fwMap.get(ElementType_Charactor) != null) {
			System.out.println("字符对象数量："
					+ fwMap.get(ElementType_Charactor).size());
		}
		if (fwMap.get(ElementType_Image) != null) {
			System.out
					.println("图片对象的数量：" + fwMap.get(ElementType_Image).size());
		}
		System.out.println(fontSet.size());
	}

}

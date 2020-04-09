package com.shenjiakun.common.utils;
/**
 * 文件工具类(FileUtil.java)
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author: admin
 * @date: 2020年4月9日 下午2:37:00
 */
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		if (fileName != null && fileName.length() != 0) 
			return fileName.substring(fileName.lastIndexOf("."));
		
		return "不是有效文件";
	}

}

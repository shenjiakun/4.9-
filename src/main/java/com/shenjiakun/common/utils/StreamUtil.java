package com.shenjiakun.common.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 流处理工具类(StreamUtil.java)	
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author: admin
 * @date: 2020年4月9日 下午2:37:22
 */
public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传入无限个。(10分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(AutoCloseable ... autoCloseables){
		if (autoCloseables.length!=0) {
			for (AutoCloseable autoCloseable : autoCloseables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	//TODO 实现代码
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src){
		//字节输出流
		ByteArrayInputStream out = new ByteArrayInputStream(null);
		byte[] b = new byte[1024];
		String str = "";
		int x = 0;
		try {
			while((x=src.read(b))!=-1) {
			}
			str = out.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		closeAll(out,src);
		return str;
	//TODO 实现代码
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		try {
			return readTextFile(new FileInputStream(txtFile));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	//TODO 实现代码
	}

}

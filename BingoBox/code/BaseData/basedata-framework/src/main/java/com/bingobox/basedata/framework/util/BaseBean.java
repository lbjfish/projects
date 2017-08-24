package com.bingobox.basedata.framework.util;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.List;

public class BaseBean<T> {
	public String toString(){
		 return JSON.toJSONString(this);
	}
	
	public List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException{   
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();   
        ObjectOutputStream out = new ObjectOutputStream(byteOut);   
        out.writeObject(src);   
        
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());   
        ObjectInputStream in =new ObjectInputStream(byteIn);   
        @SuppressWarnings("unchecked")
		List<T> dest = (List<T>)in.readObject();   
        return dest;   
    }   
}

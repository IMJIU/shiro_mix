package com.github.zhangkaitao.shiro;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class T1 {
	public static void main(String[] args) throws Exception {
		System.out.println("234");
	    //创建一个server
        Server server = new Server(8080);
        WebAppContext context = new WebAppContext();
        System.out.println(System.getProperty("user.dir")); 
        System.out.println(T1.class.getClassLoader().getResource(""));
        String webapp ="src\\main\\webapp\\";
        System.out.println("webapp:"+webapp);
        
        context.setDescriptor(webapp + "\\WEB-INF\\web.xml");  //指定web.xml配置文件
        context.setResourceBase(webapp);  //指定webapp目录
        context.setContextPath("/");
        context.setParentLoaderPriority(true);
 
        server.setHandler(context);
        server.start();
	}

}

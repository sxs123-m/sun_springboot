package com.sun.sunspringboot;


import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.autoconfigure.web.ServerProperties;

/**
 * @author 孙显圣
 * @version 1.0
 */
public class SunSpringApplication {
    /**
     * 创建Tomcat对象，关联Spring容器并启动
     */
    public static void run() {
        try {
            Tomcat tomcat = new Tomcat();
            //配置上下文路径为/sunboot
            tomcat.addWebapp("/sunboot", "D:\\IDEA_2023.1.4_Project\\sun_springboot");
            tomcat.setPort(9090);
            tomcat.start();
            System.out.println("Tomcat在9090端口监听");
            tomcat.getServer().await(); //等待
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
    }
}

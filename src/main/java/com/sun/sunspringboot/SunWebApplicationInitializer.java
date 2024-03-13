package com.sun.sunspringboot;

import com.sun.sunspringboot.config.SunConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 1.创建自己的Spring容器
 * 2.关联spring容器的配置
 * 3.完成spring容器配置的bean的创建，依赖注入
 * 4.完成中央控制器，并让其持有Spring容器
 * 5.这里的onStartup是Tomcat调用，并把ServletContext对象传入
 */
public class SunWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("start up");
        AnnotationConfigWebApplicationContext ac =
                new AnnotationConfigWebApplicationContext();

        //完成bean的创建和配置
        ac.register(SunConfig.class); //在ac中注册配置类
        ac.refresh();

        //创建中央控制器
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
        //将中央控制器放到servletContext
        ServletRegistration.Dynamic registration = servletContext.addServlet("app", dispatcherServlet);
        //当tomcat启动时，加载中央控制器
        registration.setLoadOnStartup(1);
        //拦截请求，进行分发处理
        registration.addMapping("/");

    }
}

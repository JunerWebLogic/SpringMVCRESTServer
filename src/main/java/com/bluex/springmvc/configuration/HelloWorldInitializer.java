package com.bluex.springmvc.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class HelloWorldInitializer{

}

/**
 * Created by 001233 on 2014/11/20.
 *
public class HelloWorldInitializer implements WebApplicationInitializer
{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(HelloWorldConfiguration.class);
        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(
                "dispacher",new DispatcherServlet(ctx)
        );
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
*/
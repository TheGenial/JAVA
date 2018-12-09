package com.mbstu.ict.config;
 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration //configuration class
@EnableWebMvc  //Enable MVC--> thats means it is an web application now
@ComponentScan //scan Every Component (Every method is a component)
public class MvcConfiguration extends WebMvcConfigurerAdapter
{
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/"); // Add this prefix to every returned String of controller
        resolver.setSuffix(".jsp"); //Add this suffix to every returned String of controller
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);
    }
}
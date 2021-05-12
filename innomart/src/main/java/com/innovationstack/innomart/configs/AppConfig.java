package com.innovationstack.innomart.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

@Configuration
@PropertySource("classpath:/application.properties")
@EnableAspectJAutoProxy
public class AppConfig {
    @Autowired
    Environment env;
    public String getValueOfKey(String key) {
        return env.getProperty(key);
    }
    
    @Primary
	@Bean 
	public FreeMarkerConfigurationFactoryBean factoryBean() {
		FreeMarkerConfigurationFactoryBean bean=new FreeMarkerConfigurationFactoryBean();
		bean.setTemplateLoaderPath("classpath:/templates");
		return bean;
	}

}

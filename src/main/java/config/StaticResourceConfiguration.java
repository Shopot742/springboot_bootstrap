package config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/css/**").addResourceLocations("classpath:/META-INF/resources/css");
        registry.addResourceHandler("/**").addResourceLocations("resources/fonts");
        registry.addResourceHandler("/resources/js/**").addResourceLocations("/resources/js");
    }
}

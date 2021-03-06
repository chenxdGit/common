package com.github.chenxdGit.common.config.mvc;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;



@SpringBootConfiguration
public class WebMvcRegistrationsConfig implements  WebMvcRegistrations {
 
    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
    	return new ApiRequestMappingHandlerMapping();
    }
}
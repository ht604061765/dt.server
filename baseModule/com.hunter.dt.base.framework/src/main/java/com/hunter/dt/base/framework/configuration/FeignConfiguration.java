package com.hunter.dt.base.framework.configuration;

import com.google.gson.GsonBuilder;
import com.hunter.dt.base.common.cons.WxConstants;
import com.hunter.dt.base.common.feign.IWxServerFeign;
import feign.Feign;
import feign.Logger;
import feign.codec.Decoder;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }


//    @Bean
//    public IWxServerFeign feignQwService() {
//        String wxApiBaseUrl = WxConstants.WX_URI_AUTH_CODE2SESSION;
//        GsonBuilder builder = new GsonBuilder();
//        builder.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        return Feign.builder().target(IWxServerFeign.class, wxApiBaseUrl);
//    }


    @Bean
    public Decoder feignDecoder() {
        return new ResponseEntityDecoder(new SpringDecoder(feignHttpMessageConverter()));
    }

    public ObjectFactory<HttpMessageConverters> feignHttpMessageConverter() {
        final HttpMessageConverters httpMessageConverters = new HttpMessageConverters(new converter());
        return () -> httpMessageConverters;
    }

    public class converter extends MappingJackson2HttpMessageConverter {
        converter(){
            List<MediaType> mediaTypes = new ArrayList<>();
            mediaTypes.add(MediaType.valueOf(MediaType.TEXT_HTML_VALUE + ";charset=UTF-8")); //关键
            setSupportedMediaTypes(mediaTypes);
        }
    }
}

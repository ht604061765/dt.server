//package com.hunter.dt.base.framework.intercepter;
//
//import feign.RequestInterceptor;
//import feign.RequestTemplate;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.context.request.RequestAttributes;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Enumeration;
//
///**
// * 实现 RequestInterceptor，用于设置feign全局请求模板
// * @author Hunter
// * @date 2020/11/4
// */
//@Configuration
//@EnableFeignClients
//public class FeignRequestInterceptor implements RequestInterceptor {
//
//    @Override
//    public void apply(RequestTemplate template) {
//        // 通过 RequestContextHolder 获取本地请求
//        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
//        if (requestAttributes == null) {
//            return;
//        }
//        // 获取本地线程绑定的请求对象
//        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();
//        // 给请求模板附加本地线程头部信息，主要是 cookie 信息
//        Enumeration<String> headerNames = request.getHeaderNames();
//        if (headerNames != null) {
//            while (headerNames.hasMoreElements()) {
//                String name = headerNames.nextElement();
//                Enumeration<String> values = request.getHeaders(name);
//                while (values.hasMoreElements()) {
//                    String value = values.nextElement();
//                    template.header(name, value);
//                }
//            }
//        }
//    }
//
//
//}

package com.ossia.springsecurity;

import com.ossia.springsecurity.service.LifecycleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("application-context.xml");
        LifecycleService lifecycleService = (LifecycleService)context.getBean("lifecycleService");
        AuthenticationManager authenticationManager = (AuthenticationManager)context.getBean("authenticationManager");

        UsernamePasswordAuthenticationToken token;
        token = new UsernamePasswordAuthenticationToken("simple", "123456");
        token = new UsernamePasswordAuthenticationToken("admin", "123456");
        token = new UsernamePasswordAuthenticationToken("amok", "123456");

        Authentication result = authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(result);

        lifecycleService.createProduct();
        lifecycleService.listProducts();
    }

}

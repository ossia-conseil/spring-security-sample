package com.ossia.springsecurity.service.impl;

import com.ossia.springsecurity.service.LifecycleService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;

public class LifecycleServiceImpl implements LifecycleService {

    @Override
    public List<String> listProducts() {
        System.out.println("list products");
        ArrayList<String> result = new ArrayList<String>();
        result.add("prod44534");
        result.add("prod77328");
        return result;
    }

    @Override
    @Secured("ROLE_ADMIN")
    @RolesAllowed("ROLE_ADMIN")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void createProduct() {
        System.out.println("create product");
    }

}

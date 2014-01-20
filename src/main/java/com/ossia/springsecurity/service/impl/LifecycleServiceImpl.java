package com.ossia.springsecurity.service.impl;

import com.ossia.springsecurity.service.LifecycleService;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;

public class LifecycleServiceImpl implements LifecycleService {

    private static final Logger LOGGER = Logger.getLogger(LifecycleServiceImpl.class);

    @Override
    public List<String> listProducts() {
        LOGGER.info("List Products");
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
        LOGGER.info("Create Product");
    }

}

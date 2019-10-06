package com.sunshine.dubbo.cosumer.impl;

import com.sunshine.dubbo.api.UserService;
import com.sunshine.dubbo.cosumer.ClientService;
import com.sunshine.dubbo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Override
    public void test() {

        boolean addResult = userService.addUser(new User());
        logger.debug("addResult:{}", addResult);
        System.out.println(addResult);

    }

    @Override
    public User getUser() {
        return userService.getUser(1L);
    }


}

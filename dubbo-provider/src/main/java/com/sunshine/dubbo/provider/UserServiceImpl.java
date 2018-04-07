package com.sunshine.dubbo.provider;

import com.sunshine.dubbo.api.UserService;
import com.sunshine.dubbo.model.User;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    public boolean addUser(User user) {
        return false;
    }

    public boolean updatetUser(User user) {
        return false;
    }

    public User getUser(long id) {
        return null;
    }
}

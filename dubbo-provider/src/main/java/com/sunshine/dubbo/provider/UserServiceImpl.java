package com.sunshine.dubbo.provider;

import com.sunshine.dubbo.api.UserService;
import com.sunshine.dubbo.model.User;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    public boolean addUser(User user) {
        return true;
    }

    public boolean updatetUser(User user) {
        return true;
    }

    public User getUser(long id) {
        User u = new User();
        u.setId(1L);
        u.setAge(10);
        u.setName("wangt");
        return u;
    }
}

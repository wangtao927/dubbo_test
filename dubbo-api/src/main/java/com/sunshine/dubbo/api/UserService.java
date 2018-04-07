package com.sunshine.dubbo.api;

import com.sunshine.dubbo.model.User;

public interface UserService {

    boolean addUser(User user);

    boolean updatetUser(User user);

    User getUser(long id);




}

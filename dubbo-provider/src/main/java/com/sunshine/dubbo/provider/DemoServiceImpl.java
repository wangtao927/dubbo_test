package com.sunshine.dubbo.provider;

import com.sunshine.dubbo.api.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    public String hello() {
        return null;
    }

    public String hello1(String param) {
        return null;
    }
}

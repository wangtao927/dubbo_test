package com.sunshine.dubbo.cosumer;

import com.sunshine.dubbo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    private static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        logger.info("start init consumer");
        ClientService clientService = (ClientService) context.getBean("clientServiceImpl");
        clientService.test();
        User u = clientService.getUser();
        System.out.println(u);
    }
}

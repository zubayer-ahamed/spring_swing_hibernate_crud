
package com.coderslab.test;

import com.coderslab.dao.ProductDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ProductDao productDao = context.getBean("productDao", ProductDao.class);
        
        System.out.println(productDao.getAllProduct());
    }
}

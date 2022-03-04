package com.boot.test;

import com.base.conf.DataBaseConf;
import com.base.jar.test.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zengguosheng
 * @Date 2022/2/23 9:19
 */
public class MySpringBootTest {
    public static void main(String[] args) {
        String path = "classpath:base.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        Bean bean = context.getBean("bean", Bean.class);
        DataBaseConf dbConf = context.getBean("dbConf", DataBaseConf.class);
        System.out.println("=====================================");
        System.out.printf("数据库配置信息: %s \n" , dbConf);
        System.out.println("=====================================");
        bean.call();
    }
}

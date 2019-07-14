package web.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import web.dao.UserMapper;
import web.pojo.User;

public class TestMyBatisSpring {
    @Test
    public void testFn(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        UserMapper userMapper =(UserMapper) applicationContext.getBean("userMapper");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        User user = userMapper.getUserById(3);
        System.out.println(user);

    }
}

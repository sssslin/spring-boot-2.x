package com.bigdoufuspace.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author linjunfeng
 * @version V1.0.0
 * Description 测试mybatis
 * @date 2019/4/12 10:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() {
        userMapper.insert("AAA", 20);

        User user = userMapper.findByName("AAA");
        Assert.assertEquals(20, user.getAge().intValue());
    }
}

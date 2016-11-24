package com.citylight.web.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})

public class BaseTest {
    //使用Maven test，创建一个空的测试方法，要不然报错
    @Test
    public void testEmpty() {

    }
}

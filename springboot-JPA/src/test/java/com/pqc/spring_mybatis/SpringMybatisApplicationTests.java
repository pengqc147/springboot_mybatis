package com.pqc.spring_mybatis;

import com.pqc.spring_mybatis.entity.Depar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringMybatisApplication.class)
public class SpringMybatisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }
    @org.junit.jupiter.api.Test
    public void testRedis(){
        redisTemplate.opsForValue().set("hello","world");
        String str = (String)redisTemplate.opsForValue().get("hello");
        System.out.println(str);
        Depar depar = new Depar();
        depar.setDeptno(111);
        depar.setDname("科研部");
        depar.setLoc("广州");
        redisTemplate.opsForValue().set("depar",depar);
        Depar depar2 = (Depar)redisTemplate.opsForValue().get("depar");
        System.out.println(depar2);
    }
}

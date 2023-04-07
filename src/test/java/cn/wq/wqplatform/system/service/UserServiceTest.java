package cn.wq.wqplatform.system.service;

import cn.wq.wqplatform.system.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.time.LocalDateTime;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void getById() {
        User user = userService.findById(2L);
        System.out.println(user);
    }

    @Test
    void save(){
        User user = new User();
        user.setUsername("wangqi");
        user.setGender(0);
        user.setPassword("123456");
        user.setIdCard("123213213");
        user.setEmail("afdadf@123.com");
        user.setPhone("12322223334");
        user.setBirthday(LocalDateTime.now());
        user.setLastLogin(LocalDateTime.now());
        user.setCreatedBy(1);
        user.setCreatedTime(LocalDateTime.now());
        userService.save(user);
    }
}

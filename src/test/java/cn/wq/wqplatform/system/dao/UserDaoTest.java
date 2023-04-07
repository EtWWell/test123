package cn.wq.wqplatform.system.dao;
import java.time.LocalDateTime;
import java.util.Optional;

import cn.wq.wqplatform.system.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import javax.annotation.Resource;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    void save(){
        User user = new User();
        user.setUsername("张三");
        user.setGender(0);
        user.setPassword("123456");
        user.setIdCard("123213213");
        user.setEmail("afdadf@123.com");
        user.setPhone("12322223334");
        user.setBirthday(LocalDateTime.now());
        user.setLastLogin(LocalDateTime.now());
        user.setCreatedBy(1);
        user.setCreatedTime(LocalDateTime.now());
        User save = userDao.save(user);
        System.out.println(save);
    }

    @Test
    void getById(){
        Optional<User> user = userDao.findById(1L);
        System.out.println(user);
        System.out.println(user.get());
        System.out.println(user.get().getCreatedTime());
    }

    @Test
    void updateById(){
        Optional<User> user = userDao.findById(1L);
        if(user.isPresent()){
            User user1 = user.get();
            user1.setUsername("李四");
            User save = userDao.save(user1);
            System.out.println(save);
        }
    }

    @Test
    void deletById(){
        userDao.deleteById(1L);
    }

    @Test
    void logicDeleteById(){
        userDao.logicDeleteById(1L);
    }
}
package cn.wq.wqplatform.system.dao;

import cn.wq.wqplatform.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户持久层
 */
@Repository
public interface UserDao extends BaseDao<User> {

    /**
     * 根据用户名查询用户
     */
    User findByUsername(String username);
}

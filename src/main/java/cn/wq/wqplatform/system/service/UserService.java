package cn.wq.wqplatform.system.service;

import cn.wq.wqplatform.system.entity.User;

public interface UserService extends BaseService<User> {
    void login(User user);
}

package cn.wq.wqplatform.system.service;


import cn.wq.wqplatform.system.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {


    T findById(Long id);

    void save(T entity);

    void updateById(T entity);

    void deleteById(Long id);
}

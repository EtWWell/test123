package cn.wq.wqplatform.system.service.impl;

import cn.wq.wqplatform.system.dao.BaseDao;
import cn.wq.wqplatform.system.entity.BaseEntity;
import cn.wq.wqplatform.system.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BaseServiceImpl<D extends BaseDao<T>, T extends BaseEntity> implements BaseService<T> {

    @Resource
    protected D dao;


    @Override
    public T findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void save(T entity) {
        dao.save(entity);
    }

    @Override
    public void updateById(T entity) {
        dao.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}

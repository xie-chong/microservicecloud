package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    //@Autowired
    /*Field injection is not recommended
    Inspection info: Spring Team recommends: "Always use constructor based dependency
    injection in your beans. Always use assertions for mandatory dependencies".
    */
    private DeptDao dao;

    @Autowired
    public DeptServiceImpl(DeptDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

    // 使用get，list符合restful 风格
}

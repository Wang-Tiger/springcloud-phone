package com.jk.service.impl;

import com.jk.dao.PhoneDao;
import com.jk.entity.PhoneEntity;
import com.jk.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDao phoneDao;


    // 分页+条查
    @Override
    public HashMap<String, Object> find(PhoneEntity phone) {

        int start = (phone.getPage()-1)*phone.getRows();

        int count = phoneDao.findCount(phone);

        List<PhoneEntity> list = phoneDao.find(start,phone);

        HashMap<String, Object> map = new HashMap<>();
        map.put("total",count);
        map.put("rows",list);

        return map;
    }

    // 新增、修改
    @Override
    public void add(PhoneEntity phone) {
        if (phone.getId() == null){// 新增
            phoneDao.add(phone);
        }else{// 修改
            phoneDao.update(phone);
        }
    }

    // 删除
    @Override
    public void del(Integer id) {
        phoneDao.del(id);
    }

    @Override
    public PhoneEntity findById(Integer id) {
        return phoneDao.findById(id);
    }


}

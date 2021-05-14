package com.jk.service;

import com.jk.entity.PhoneEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
public class PhonesServiceHystrix implements PhoneService {
    @Override
    public HashMap<String, Object> find(PhoneEntity phone) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",0);
        map.put("rows",null);
        return map;
    }

    @Override
    public void add(PhoneEntity phone) {
        System.out.println("挂了！！！！！！！！！！！！！！！！！！！！！！");
    }

    @Override
    public void del(Integer id) {
        System.out.println("挂了！！！！！！！！！！！！！！！！！！！！！！");
    }

    @Override
    public PhoneEntity findById(Integer id) {
        return null;
    }
}

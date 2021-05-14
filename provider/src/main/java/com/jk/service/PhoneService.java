package com.jk.service;

import com.jk.entity.PhoneEntity;

import java.util.HashMap;

public interface PhoneService {

    HashMap<String, Object> find(PhoneEntity phone);

    void add(PhoneEntity phone);

    void del(Integer id);

    PhoneEntity findById(Integer id);
}

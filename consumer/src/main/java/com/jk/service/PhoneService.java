package com.jk.service;

import com.jk.entity.PhoneEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@FeignClient(value = "provider",fallback = PhonesServiceHystrix.class)
public interface PhoneService {

    @RequestMapping("phone/find")
    HashMap<String, Object> find(PhoneEntity phone);

    @PostMapping("phone")
    void add(PhoneEntity phone);

    @DeleteMapping("phone")
    void del(@RequestParam Integer id);

    @GetMapping("phone")
    PhoneEntity findById(@RequestParam Integer id);
}

package com.jk.controller;

import com.jk.entity.PhoneEntity;
import com.jk.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    /**
    * @Author: wh
    * @Description: 分页+条查
    * @Date: 2021/5/13 21:18
    * @Param:[phone]
    * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
    **/
    @RequestMapping("find")
    public HashMap<String,Object> find(PhoneEntity phone){
        return phoneService.find(phone);
    }

    /**
    * @Author: wh
    * @Description: 新增、修改
    * @Date: 2021/5/13 21:29
    * @Param:[phone]
    * @Return: void
    **/
    @PostMapping
    public void add(PhoneEntity phone){
        phoneService.add(phone);
    }

    /**
    * @Author: wh
    * @Description: 删除
    * @Date: 2021/5/13 21:31
    * @Param:[id]
    * @Return: void
    **/
    @DeleteMapping
    public void del(Integer id){
        phoneService.del(id);
    }

    /**
    * @Author: wh
    * @Description: 修改回显
    * @Date: 2021/5/13 21:32
    * @Param:[id]
    * @Return: com.jk.entity.PhoneEntity
    **/
    @GetMapping
    public PhoneEntity findById(Integer id){
        return  phoneService.findById(id);
    }


}

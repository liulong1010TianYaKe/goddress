package com.pafc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by coco on 17/7/16.
 */

@RestController
public class GirlController {

    @Autowired
    private  GirlRepository girlRepository;


    @Autowired
    private  GirlService girlService;


    // 查询所有女生
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    // 添加一个女生
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return  girlRepository.save(girl);
    }

    // 查询一个女生
    @GetMapping(value = "/girls/{id}")
    public  Girl girlFindOne(@PathVariable("id") Integer id){
        return  girlRepository.findOne(id);
    }

    // 更新一个女生
    @PutMapping(value = "/girls/{id}")
    public  Girl girlUpdate(@PathVariable("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return  girlRepository.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void  girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlFindByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girl/two")
    public  void  girlTwoAdd(){
        girlService.insertTwo();
    }
}

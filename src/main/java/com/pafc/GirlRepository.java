package com.pafc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by coco on 17/7/16.
 */
public interface GirlRepository  extends JpaRepository<Girl,Integer> {

    // 通过年龄查询
    public List<Girl> findByAge(Integer age);
}

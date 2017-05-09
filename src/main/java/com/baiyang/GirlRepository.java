package com.baiyang;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by popla on 2017/5/9.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}

package com.baiyang.service;

import com.baiyang.repository.GirlRepository;
import com.baiyang.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by popla on 2017/5/9.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("BBBB");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }

    public Integer getAge(Integer id) {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10){
            //返回"你还在上小学吧"
            return 1;
        }else if (age >10 && age <16) {
            //返回"你可能在上初中"
            return 2;
        }else{
            return 0;
        }
    }

}

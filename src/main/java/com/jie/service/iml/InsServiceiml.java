package com.jie.service.iml;

import com.jie.dao.IntroduceMapper;
import com.jie.entity.Introduce;
import com.jie.entity.IntroduceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/21
 * WWW https://github.com/j6l
 */
@Service
public class InsServiceiml {

    @Autowired
    private IntroduceMapper intdao;

    public List<Introduce> getIntroduces(){
        IntroduceExample example = new IntroduceExample();
        IntroduceExample.Criteria cri = example.createCriteria();
        cri.andIdIsNotNull();
        List<Introduce> introduces = intdao.selectByExample( example );
        return introduces;

    }

    public  long insertIntroduce(Introduce intro){
        int i = intdao.insertSelective( intro );
        return i;
    }

    public  long deleteIntroduce(String uuid){
        int i = intdao.deleteByPrimaryKey( new Integer( uuid ));
        return i;
    }
}

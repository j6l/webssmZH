package com.jie.service.iml;

import com.jie.dao.HuatiMapper;
import com.jie.entity.Huati;
import com.jie.entity.HuatiExample;
import com.jie.service.HuatiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author LiJie
 * @date Created on 2020/6/17
 * WWW https://github.com/j6l
 */
@Service
public class HuatiServiceiml implements HuatiService {

    @Autowired
    private HuatiMapper huatidao;

    @Override
    public List<Huati> getallHuatis() {
        HuatiExample example = new HuatiExample();
        HuatiExample.Criteria cri = example.createCriteria();
        cri.andUuidIsNotNull();
        return huatidao.selectByExample( example );
    }

    @Override
    public Huati getHuati(String id) {
        return huatidao.selectByPrimaryKey( id );
    }

    @Override
    public long deleteHuati(String id) {
        return huatidao.deleteByPrimaryKey( id );
    }

    @Override
    public long insertHuati(Huati huati) {
        return huatidao.insertSelective( huati );
    }

    @Override
    public long updateHuati(Huati huati) {
        return huatidao.updateByPrimaryKeySelective( huati );
    }

}

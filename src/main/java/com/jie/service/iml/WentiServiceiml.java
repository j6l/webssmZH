package com.jie.service.iml;

import com.jie.dao.WentiMapper;
import com.jie.entity.Wenti;
import com.jie.entity.WentiExample;
import com.jie.service.WentiService;
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
public class WentiServiceiml implements WentiService {

    @Autowired
    private WentiMapper wentidao;

    @Override
    public List<Wenti> getallWentis() {
        WentiExample example = new WentiExample();
        WentiExample.Criteria cri = example.createCriteria();
        cri.andTimuIsNotNull();
        List<Wenti> wentis = wentidao.selectByExample( example );
        return wentis;
    }

    /**
     * @param id
     * @return 根据用户id获取问题
     */
    @Override
    public List<Wenti> getallWentiid(String id) {
        WentiExample example = new WentiExample();
        WentiExample.Criteria cri = example.createCriteria();
        cri.andUseridEqualTo( id );
        List<Wenti> wentis = wentidao.selectByExample( example );
        return wentis;
    }

    /**
     * @param id
     * @return 通过话题id查找问题
     */
    @Override
    public List<Wenti> getallhuatiid(String id) {
        WentiExample example = new WentiExample();
        WentiExample.Criteria cri = example.createCriteria();
        cri.andHuatiEqualTo( id );
        List<Wenti> wentis = wentidao.selectByExample( example );
        return wentis;
    }

    /**
     * @param name
     * @return 搜索问题题目
     */
    @Override
    public List<Wenti> getallWentiname(String name) {
        name = "%" + name + "%";
        WentiExample example = new WentiExample();
        WentiExample.Criteria cri = example.createCriteria();
        cri.andTimuLike( name );
        List<Wenti> wentis = wentidao.selectByExample( example );
        return wentis;
    }

    @Override
    public Wenti getWenti(String id) {
        WentiExample example = new WentiExample();
        WentiExample.Criteria cri = example.createCriteria();
        cri.andUuidEqualTo( id );
        Wenti wenti = wentidao.selectByExample( example ).get( 0 );
        return wenti;
    }

    @Override
    public long deleteWenti(String id) {
        return wentidao.deleteByPrimaryKey( id );
    }

    @Override
    public long insertWenti(Wenti wenti) {
        return wentidao.insertSelective( wenti );
    }

    @Override
    public long updateWenti(Wenti wenti) {
        return wentidao.updateByPrimaryKeySelective( wenti );
    }
}

package com.jie.service.iml;

import com.jie.dao.PinglunMapper;
import com.jie.entity.Pinglun;
import com.jie.entity.PinglunExample;
import com.jie.service.PinglunService;
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
public class PinglunServiceiml implements PinglunService {
    @Autowired
    private PinglunMapper pinglundao;

    @Override
    public List<Pinglun> getallPingluns() {
        PinglunExample example = new PinglunExample();
        PinglunExample.Criteria cri = example.createCriteria();
        cri.andUserIsNotNull();
        return pinglundao.selectByExample( example );
    }

    /**
     * @param id
     * @return 根据用户id获取评论
     */
    @Override
    public List<Pinglun> getallPinglunid(String id) {
        PinglunExample example = new PinglunExample();
        PinglunExample.Criteria cri = example.createCriteria();
        cri.andUserEqualTo( id );
        return pinglundao.selectByExample( example );
    }

    /**
     * @param id
     * @return 根据问题id获取评论
     */
    @Override
    public List<Pinglun> getallPinglunwentiid(String id) {
        PinglunExample example = new PinglunExample();
        PinglunExample.Criteria cri = example.createCriteria();
        cri.andWentiEqualTo( id );
        return pinglundao.selectByExample( example );
    }

    @Override
    public Pinglun getPinglun(String id) {
        PinglunExample example = new PinglunExample();
        PinglunExample.Criteria cri = example.createCriteria();
        cri.andUuidEqualTo( id );
        return pinglundao.selectByExample( example ).get( 0 );
    }

    @Override
    public long deletePinglun(String id) {
        PinglunExample example = new PinglunExample();
        PinglunExample.Criteria cri = example.createCriteria();
        cri.andUuidEqualTo( id );
        return pinglundao.deleteByExample( example );
    }

    @Override
    public long insertPinglun(Pinglun pinglun) {

        return pinglundao.insertSelective( pinglun );
    }

    @Override
    public long updatePinglun(Pinglun pinglun) {
        PinglunExample example = new PinglunExample();
        PinglunExample.Criteria cri = example.createCriteria();
        cri.andUuidEqualTo( pinglun.getUuid() );
        return pinglundao.updateByExampleSelective( pinglun, example );
    }
}

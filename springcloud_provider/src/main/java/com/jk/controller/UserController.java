package com.jk.controller;

import com.jk.mapper.UserMapper;
import com.jk.pojo.GoodsBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @ResponseBody
    public List<GoodsBean> select() {

        return userMapper.select();
    }
    @Override
    @ResponseBody
    public void save(@RequestBody GoodsBean goodsBean) {
        String  id = goodsBean.getId();
        if (id != null){
            userMapper.update(goodsBean);
        }else{
            userMapper.save(goodsBean);
        }
    }

    @Override
    @ResponseBody
    public GoodsBean selectGoodsById(@RequestParam("id") String  id) {

        return userMapper.selectGoodsById(id);
    }

    @Override
    @ResponseBody
    public void delete(@RequestParam("id") String  id) {
        userMapper.delete(id);
    }

}

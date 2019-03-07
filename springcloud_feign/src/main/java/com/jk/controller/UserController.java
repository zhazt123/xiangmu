package com.jk.controller;

import com.jk.pojo.GoodsBean;
import com.jk.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class UserController {
    @Autowired
    private UserServiceFeign userServiceFeign;

    @PostMapping("save")
    @ResponseBody
    public void save(@RequestBody GoodsBean goodsBean){

        userServiceFeign.save(goodsBean);
    }

    @GetMapping("select")
    @ResponseBody
    public List<GoodsBean> select() {
        List<GoodsBean> list= userServiceFeign.select();
        return list;
    }
    @GetMapping("selectGoodsById")
    @ResponseBody
    public GoodsBean selectGoodsById(@RequestParam("id") String  id) {
        GoodsBean ben =  userServiceFeign.selectGoodsById(id);
        return ben;
    }

    @DeleteMapping("delete")
    @ResponseBody
    public Boolean delete(@RequestParam("id") String   id){
        try {
            userServiceFeign.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @RequestMapping("toShow")
    public String toShow(){
        return "show";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(){
        return "update";
    }

}


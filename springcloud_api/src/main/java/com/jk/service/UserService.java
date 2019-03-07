package com.jk.service;

import com.jk.pojo.GoodsBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("user")
public interface UserService {

    @GetMapping("select")
    List<GoodsBean> select();

    @PostMapping("save")
    void save(GoodsBean goodsBean);

    @GetMapping("selectGoodsById")
    GoodsBean selectGoodsById(@RequestParam("id")String id);

    @DeleteMapping("delete")
    void delete(@RequestParam("id")String id);
}

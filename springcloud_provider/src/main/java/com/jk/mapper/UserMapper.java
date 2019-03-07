package com.jk.mapper;

import com.jk.pojo.GoodsBean;

import java.util.List;

public interface UserMapper {
    List<GoodsBean> select();

    GoodsBean selectGoodsById(String id);

    void update(GoodsBean goodsBean);

    void save(GoodsBean goodsBean);

    void delete(String   id);
}

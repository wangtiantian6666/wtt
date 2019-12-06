package com.wangtiantian.mapper;

import java.util.List;
import java.util.Map;

import com.wangtiantian.pojo.Goods;
import com.wangtiantian.pojo.Kind;

public interface MyMapper {
	List<Goods> getGoods(Map<String, Object> map);
	int save(Goods g);
	int delete(List<Integer> list);
	int updateGoods(List<Integer> list);
	int delete2(Integer id);
	int update(Goods g);
	Goods getById(int id);
	List<Kind> getKind();
	
}

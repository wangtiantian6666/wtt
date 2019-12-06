package com.wangtiantian.service;

import java.util.List;
import java.util.Map;

import com.wangtiantian.pojo.Goods;
import com.wangtiantian.pojo.Kind;

public interface MyService {
	List<Goods> getGoods(Map<String, Object> map);
	int save(Goods g);
	int delete(List<Integer> list);
	int delete2(Integer id);
	int update(Goods g);
	Goods getById(int gid);
	List<Kind> getKind();
	
	int updateGoods(List<Integer> list);
}

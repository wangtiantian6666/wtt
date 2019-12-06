package com.wangtiantian.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangtiantian.mapper.MyMapper;
import com.wangtiantian.pojo.Goods;
import com.wangtiantian.pojo.Kind;
@Service
public class MyServiceImpl implements MyService {
	@Resource
	private MyMapper mm;
	public List<Goods> getGoods(Map<String, Object> map) {
		return mm.getGoods(map);
	}

	public int save(Goods g) {
		return mm.save(g);
	}

	public int delete(List<Integer> list) {
		return mm.delete(list);
	}

	public int update(Goods g) {
		g.setStatus(0);
		return mm.update(g);
	}

	
	public List<Kind> getKind() {
		return mm.getKind();
	}

	public int delete2(Integer id) {
		return mm.delete2(id);
	}

	public Goods getById(int gid) {
		return mm.getById(gid);
	}

	public int updateGoods(List<Integer> list) {
		int updateGoods = mm.updateGoods(list);
		return updateGoods;
	}

}

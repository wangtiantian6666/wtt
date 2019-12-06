package com.wangtiantian.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangtiantian.pojo.Goods;
import com.wangtiantian.pojo.Kind;
import com.wangtiantian.service.MyService;

@Controller
public class MyController {
	@Resource
	private MyService ms;
	
	@RequestMapping("show")
	public String list(String gname,@RequestParam(defaultValue="1")Integer pageNum,Model model){
		PageHelper.startPage(pageNum, 2);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("gname", gname);
		List<Goods> list = ms.getGoods(map);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		return "show";
	}
	@RequestMapping("save")
	@ResponseBody
	public int save(Goods g){
		return ms.save(g);
	}
	
	@RequestMapping("delete2")
	@ResponseBody
	public boolean delete2(String id){
		String[] split = id.split(",");
		List<Integer> list=new ArrayList<Integer>();
		for (String string : split) {
			int ids=Integer.parseInt(string);
			list.add(ids);
		}
		ms.delete(list);
		return true;
	}
	@RequestMapping("delete")
	public int delete(String ids){
		List<Integer> list = new ArrayList<Integer>();
		String[] arr = ids.split(",");
		for (String string : arr) {
			int id = Integer.parseInt(string);
			list.add(id);
		}
		return ms.delete(list);
	}
	@RequestMapping("updateGoods")
	@ResponseBody
	public boolean updateGoods(String id){
		String[] split = id.split(",");
		List<Integer> list=new ArrayList<Integer>();
		for (String string : split) {
			int ids=Integer.parseInt(string);
			list.add(ids);
		}
		ms.updateGoods(list);
		return true;
	}
	
	@RequestMapping("upd")
	@ResponseBody
	public int update(Goods g){
		return ms.update(g);
	}
	
	@RequestMapping("getById")
	@ResponseBody
	public Goods getById(int id){
		Goods byId = ms.getById(id);
		return byId;
	}
	
	@RequestMapping("getKind")
	@ResponseBody
	public List<Kind> getKind(){
		return ms.getKind();
	}
	
	
}
























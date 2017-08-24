package com.tarena.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tarena.entity.User;

/**
 *	Action是Struts2中的业务控制器，等价于SpringMVC
 *	中的Controller，在这里写业务代码
 */
public class HelloAction {

	//基本属性
	private String name;
	private Integer age;
	//域模型
	private User user;
	
	//数组
	private String[] langs;
	//集合
	private List<String> cities;
	//Map
	private Map<String, Object> map;
	
	//模拟分页相关数据
	private List<User> users;
	private int totalPage;
	private int currentPage;
	
	public String sayHello() {
		//初始化基本属性
		name = "Tarena";
		age = 9;
		//初始化实体对象
		user = new User();
		user.setUserName("zhangsan");
		user.setPassword("123");
		//初始化数组和集合
		langs = new String[] {"Java","php",".net"};
		cities = new ArrayList<String>();
		cities.add("北京");
		cities.add("上海");
		cities.add("广州");
		//初始化Map
		map = new HashMap<String, Object>();
		map.put("beijing", "2800万人");
		map.put("shanghai", "2300万人");
		map.put("guangzhou", "2500万人");
		
		//初始化分页相关数据
		users = new ArrayList<User>();
		User u1 = new User();
		u1.setUserName("zhangsan");
		u1.setPassword("1");
		users.add(u1);
		User u2 = new User();
		u2.setUserName("lisi");
		u2.setPassword("2");
		users.add(u2);
		User u3 = new User();
		u3.setUserName("wangwu");
		u3.setPassword("3");
		users.add(u3);
		
		totalPage = 5;
		currentPage = 2;
		
		return "ok";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
		System.out.println("注入user对象...");
	}

	public String[] getLangs() {
		return langs;
	}

	public void setLangs(String[] langs) {
		this.langs = langs;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
}

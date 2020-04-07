package com.xiu.bean;

//工人类
public class Worker {
	private String name;

	public Worker(){
		System.out.println("the worker object is finish");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

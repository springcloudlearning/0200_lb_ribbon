package com.ymd.learn.entity;

public class User {

	private int id;
	private String name;
	private int age;
	private int port;
	
	public User() {
		super();
	}
	public User(int id, String name, int age, int port) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.port = port;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}

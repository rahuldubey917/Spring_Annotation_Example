package com.rd.beans;

public class Engine {

	//declearing variable
	private int id;
    private String type;
	
	//setters and getters
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

//overriding toString Method
@Override
public String toString() {
	return "Engine [id=" + id + ", type=" + type + "]";
}
	
}

package com.scs.entity;

public class Engine {

	private int eno;
	private String etype;
	private int capacity;
	
	public Engine() {}
	public Engine(int eno, String etype, int capacity) {
		this.eno = eno;
		this.etype = etype;
		this.capacity = capacity;
	}
	public int getEno() {
		return eno;
	}
	public String getEtype() {
		return etype;
	}
	public int getCapacity() {
		return capacity;
	}
	
	
	
	
	
}

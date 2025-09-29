package com.nit.spring;

public class Engine {
	
	private String type;
	private int horsePower;
	
	public void setType(String type) {
		this.type = type;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public String getType() {
		return type;
	}
	public int getHorsePower() {
		return horsePower;
	}
	
	@Override
	public String toString() {
		return "Engine[type="+type+",horsePower="+horsePower+"]";
	}

}

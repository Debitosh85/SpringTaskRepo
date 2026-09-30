package com.nt.dependent;

public final class Dtdc implements ICourier {
	
	@Override
	public void deliver(int oid) {
		
		System.out.println("order deliver through DTDC:"+oid);
	}
}

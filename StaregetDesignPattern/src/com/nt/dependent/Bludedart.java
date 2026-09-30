package com.nt.dependent;

public final class Bludedart implements ICourier {

	@Override
	public void deliver(int oid) {
		System.out.println("Order Delivered through BlueDart:"+oid);
	}
}

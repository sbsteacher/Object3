package com.sbs.obj;

public class SamsungTv extends Tv {
	public SamsungTv(int inch, int total_channel) {
		super("Samsung", inch, total_channel);
	}
	
	public void pickupProduct() {
		System.out.println("삼성서비스센터에서 물품을 가지러옵니다.");
	}
	
	@Override
	public String toString() {
		return "또 하나의 가족 Samsung";
	}
}


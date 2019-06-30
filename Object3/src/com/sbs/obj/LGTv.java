package com.sbs.obj;

public class LGTv extends Tv {
	
	public LGTv(int inch, int total_channel) {
		super("LG", inch, total_channel);
	}
	
	public void callASCenter() {
		System.out.println("LG 서비스센터로 전화를 겁니다.");
	}
		
}


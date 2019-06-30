package com.sbs.obj;

public class TvTest {

	public static void main(String[] args) {		
		Tv tv = new Tv("LG", 0, 0);
		Tv tv2 = new Tv("Samsung", 0, 0);
		System.out.println(tv);
		System.out.println(tv2);
		
		SamsungTv stv = new SamsungTv(100, 200);
		
		LGTv lgtv = new LGTv(100, 200);
		System.out.println(stv);
		System.out.println(lgtv);
	
		tv = stv;
		tv2 = lgtv;
		System.out.println(tv);
		System.out.println(tv2);
		
		/*
		Tv tv1 = new Tv("", 0, 0);
		LGTv lgtv1 = (LGTv)tv1;
		*/
		
		/*
		LGTv lgtv1 = new LGTv(100, 200); //A
		Tv tv1 = lgtv1;
		LGTv lgtv2 = lgtv1;
		LGTv lgtv3 = (LGTv)tv1;
		
		lgtv1.channelUp();
		lgtv2.channelUp();		
		
		lgtv1.showTvInfo();
		tv1.showTvInfo();
		lgtv2.showTvInfo();
		lgtv3.showTvInfo();
		*/
	}

}

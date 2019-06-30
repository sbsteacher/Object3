package com.sbs.obj;



public class Tv {
	public final String BRAND;
	public final int INCH;
	public final int TOTAL_CHANNEL;
	private int currentChannel;
	private int volumn;
	
	public Tv() {
		System.out.println("---Tv 기본 생성자---");
		BRAND = "삼성";
		INCH = 10;
		TOTAL_CHANNEL = 200;
	}
			
	public Tv(String brand, int inch, int total_channel) {
		this.BRAND = brand;
		this.INCH = inch;
		this.TOTAL_CHANNEL = total_channel;
		this.currentChannel = 1;
		this.volumn = 10;
	}
	
	public void channelUp() {		
		currentChannel++;
		
		if(currentChannel > TOTAL_CHANNEL) {
			currentChannel = 1;			
		}
	}
	
	public void channelDown() {
		currentChannel--;
		
		if(currentChannel < 1) {
			currentChannel = TOTAL_CHANNEL;
		}
	}
	
	public void volumnUp() {
		if(volumn < 100) {
			volumn++;	
		}		
	}
	
	public void volumnDown() {
		if(volumn > 0) {
			volumn--;	
		}
		
	}
	
	public void showTvInfo() {
		System.out.printf("%s Tv, %d인치, %d채널수 현재 Tv 채널은 %d, 볼륨은 %d 입니다.\n"
				, this.BRAND, this.INCH, this.TOTAL_CHANNEL, this.currentChannel, this.volumn);
	}
		
	
}



























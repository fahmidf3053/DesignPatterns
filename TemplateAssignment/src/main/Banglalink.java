package main;

public class Banglalink extends Operator {
	public Banglalink(int starttime, int endtime, int tt) {
		super(starttime,endtime,tt);
	}
	
	void pickHour() {				
		System.out.println(tt*.5/60+"Taka");
	}
	
	void notPickHour() {
		System.out.println(tt*1/60+"Taka");
	}
}

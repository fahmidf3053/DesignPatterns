package main;

public class TeleTalk extends Operator {
	public TeleTalk(int starttime, int endtime, int tt) {
		super(starttime,endtime,tt);
	}
	
	void pickHour() {				
		System.out.println(tt*1.5/60+"Taka");
	}
	
	void notPickHour() {
		System.out.println(tt*1.5/60+"Taka");
	}
}
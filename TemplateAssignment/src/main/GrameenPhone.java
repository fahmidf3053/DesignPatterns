package main;

public class GrameenPhone extends Operator {
	
	public GrameenPhone(int starttime, int endtime, int tt) {
		super(starttime,endtime,tt);
	}
	
	void pickHour() {	
		//System.out.println("Kire"+tt);
		System.out.println(tt*1/60+"Taka");
	}
	
	void notPickHour() {
		System.out.println(tt*2/60+"Taka");
	}
	
}

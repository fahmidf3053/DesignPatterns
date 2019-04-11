package main;

public abstract class Operator {
	int starttime;
	int endtime;
	int tt;
	
	abstract void pickHour();
	abstract void notPickHour();
	
	public Operator(int starttime, int endtime, int tt) {
		this.starttime=starttime;
		this.endtime=endtime;
		this.tt=tt;
	}
	
	public final  void  call() {
		if(starttime>=0 && endtime<=200)
			pickHour();
		else
			notPickHour();
	}
	
}

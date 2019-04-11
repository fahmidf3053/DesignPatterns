package main;

public class Factory {
		String reg;
		ICountry country;
		
		public Factory(String reg) {
			this.reg=reg;
		}
		
		public ICountry createCountry() {
				if(reg.equals("Oriental")) {
					country = new Oriental();
				}
				
				else 
					country = new Occidental();
				
				return country;
		}
}

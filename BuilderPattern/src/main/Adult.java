package main;

public class Adult {
	 private MainDish mainDish;
	 private Desert desert;
	 private SoftDrinks softDrinks;


	 private Adult() {

	 }


	 public static class Builder {
	 private MainDish mainDish;
	 private Desert desert;
	 private SoftDrinks softDrinks;


	 public Builder() {
	       mainDish = null;
	       desert = null;
	       softDrinks = null;
	 }


	        public Builder withMainDish(MainDish mainDish) {
	            this.mainDish = mainDish;
	            return this; 
	        }

	        public Builder withDesert(Desert desert) {
	            this.desert = desert;
	            return this;
	        }

	        public Builder withSoftDrink(SoftDrinks softDrinks) {
	            this.softDrinks = softDrinks;
	            return this;
	        }

	        

	        public Adult build() {

	            Adult adultsMeal = new Adult();
	            adultsMeal.mainDish = this.mainDish;
	            adultsMeal.desert = this.desert;
	            adultsMeal.softDrinks = this.softDrinks;

	            return adultsMeal;
	        }
	    }

	    public String getMainDish() {
	        if(mainDish != null)
	            return mainDish.toString();
	        return "";
	    }

	    public String getDesert() {
	        if(desert != null)
	            return desert.toString();
	        return "";
	    }

	    public String getSoftDrinks() {
	        if(softDrinks != null)
	            return softDrinks.toString();
	        return "";
	    }

}

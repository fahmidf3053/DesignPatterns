package main;

public class Kid {
	private MainDish mainDish;
    private Desert desert;
    private SoftDrinks softDrinks;
    
    private Kid() {

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


        public Builder withMainDish(MainDish mainDish){
            this.mainDish = mainDish;
            return this;  
        }
        public Builder withDesert(Desert desert){
            this.desert = desert;
            return this;
        }
        public Builder withSoftDrink(SoftDrinks softDrinks){
            this.softDrinks = softDrinks;
            return this;
        }
        
        public Kid build()
        {
            Kid kidsMeal = new Kid();
            kidsMeal.mainDish = this.mainDish;
            kidsMeal.desert = this.desert;
            kidsMeal.softDrinks = this.softDrinks;
            return kidsMeal;
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

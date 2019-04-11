package main;

public class Restaurant {
	private Kid kidsMenu;
    private Adult adultsMenu;


    public Restaurant() {
        this.kidsMenu = new Kid.Builder()
                .withMainDish(new Burger())
                .withDesert(new Donut())
                .withSoftDrink(new Pepsi())
                .build();


        this.adultsMenu = new Adult.Builder()
                .withMainDish(new Pizza())
                .withDesert(new CheeseCake())
                .withSoftDrink(new Fanta())
                .build();

    }

    /*getter ,setters*/
}

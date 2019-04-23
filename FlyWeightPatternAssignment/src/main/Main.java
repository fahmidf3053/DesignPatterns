package main;
import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] arguments) {

    	Instant start = Instant.now();
        for(int i=0; i<1000; i++) {
            Rectangle panel = new Rectangle((int)Math.random()%4*100, (int)Math.random()%4*100,"red");
        }
        Instant end = Instant.now();

        System.out.println("Without FlyWeight time: "+ Duration.between(start, end).toMillis()+" Milliseconds");



        Factory flyWeightFactory = new Factory();
        start = Instant.now();
        for(int i=0; i<1000; i++) {
            Rectangle panel = flyWeightFactory.getRectangle((int)Math.random()%4*100, (int)Math.random()%4*100,"blue");
        }
        end = Instant.now();
        System.out.println("With FlyWeight time: "+ Duration.between(start, end).toMillis()+" Milliseconds");


    }
}
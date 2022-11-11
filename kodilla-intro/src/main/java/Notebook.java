import java.awt.*;

public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price <= 600){
            System.out.println("This notebook is very cheap.");
        }
        if (this.price > 600 && this.price <= 1000 ){
            System.out.println("This price is good.");
        }
        if (this.price > 1000){
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight(){
        if (this.weight <= 1000){
            System.out.println("This notebook is very light");
        }
        if (this.weight > 1000 && this.weight <= 1800){
            System.out.println("This notebook is not quite heavy");
        }
        if (this.weight > 1800){
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkYear(){
        if (this.year > 2010 && this.price >= 2000){
            System.out.println("This notebook is perfect");
        }
        if (this.year <= 2010 && this.year > 2000 && this.price >= 1000 && this.price < 2000){
            System.out.println("This notebook is good");
        }
        else if (this.year <= 2000 && this.price < 1000){
            System.out.println("This notebook is not for me");
        }
    }
}

package org.yup.oregontrail;

public class Traveler {

    private String name;
    private int Health;
    private boolean isHealthy;

    private int food;


    public Traveler(String name, int Health, int food){
        this.name = name;
        this.Health = Health;
        this.food = food;
        this.isHealthy = true;
    }

    public String hunt(){

        if(Math.random() > 0.5){
            this.food += 100;
            return "The hunt was successful for " + this.name + " and their food is now at " + this.food;
        }
        return "The hunt was unsuccessful for " + this.name + " and their food is now at " + this.food;

    }

    public String eat(){

        //Consumes 20 of the traveler's food. If the traveler doesn't have 20 food, the traveler is no longer healthy.
        if(this.getFood() >= 20){
            this.setFood(this.getFood() -  20);
            this.setHealthy(true);
            this.setHealth(100);
            return "Man o man, that was delicious";
        }else{
            this.setHealthy(false);
            this.setHealth(0);
            return "I am so hungry and don't have enough food. I think i'm dying";
        }


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}

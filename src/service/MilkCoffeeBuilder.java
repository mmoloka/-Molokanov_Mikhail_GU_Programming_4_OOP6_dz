package service;

import data.MilkCoffee;

public class MilkCoffeeBuilder extends CoffeeBuilder {

    private String milk;

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public MilkCoffee builtMilkCoffee() {
        System.out.println("Добавили молоко.");
        return new MilkCoffee(builtCoffee(), milk);
    }
}

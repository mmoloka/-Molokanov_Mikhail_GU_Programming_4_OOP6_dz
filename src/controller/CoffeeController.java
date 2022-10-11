package controller;

import data.Coffee;
import data.MilkCoffee;
import data.Mocacсino;
import data.RafCoffee;
import service.CoffeeBuilder;
import service.MilkCoffeeBuilder;
import service.MocaccinoBuilder;
import service.RafCoffeeBuilder;

public class CoffeeController {
    CoffeeBuilder coffeeBuilder;
    public Coffee getCoffee() {
        coffeeBuilder = new CoffeeBuilder();
        coffeeBuilder.boilingWater();
        coffeeBuilder.setWater("Наливаем в чашку 250 мл воды.");
        coffeeBuilder.setSugar("Добавляем чайную ложку сахара.");
        coffeeBuilder.setTypeOfCoffee("Добавляем чайную ложку растворимого кофе.");
        return coffeeBuilder.builtCoffee();
    }

    public MilkCoffee getMilkCoffee() {
        coffeeBuilder = new MilkCoffeeBuilder();
        ((MilkCoffeeBuilder)coffeeBuilder).setMilk("Добавляем 50 мл молока.");
        return ((MilkCoffeeBuilder)coffeeBuilder).builtMilkCoffee();
    }

    public RafCoffee getRaffCoffee() {
        coffeeBuilder = new RafCoffeeBuilder();
        ((RafCoffeeBuilder)coffeeBuilder).setSyrup("Добавляем чайную ложку сиропа.");
        ((RafCoffeeBuilder)coffeeBuilder).setCream("Добавляем чайную ложку теплых сливок");
        return ((RafCoffeeBuilder)coffeeBuilder).builtRafCoffee();
    }

    public Mocacсino getMocaccino() {
        coffeeBuilder = new MocaccinoBuilder();
        ((MocaccinoBuilder)coffeeBuilder).setChocolate("Добавляем столовую ложку горячего шоколада.");
        ((MocaccinoBuilder)coffeeBuilder).setCinnamon("Посыпаем корицей.");
        return ((MocaccinoBuilder)coffeeBuilder).builtMocaccino();
    }
}

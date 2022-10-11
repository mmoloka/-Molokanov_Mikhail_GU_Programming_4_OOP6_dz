package data;

public class MilkCoffee extends Coffee{
    private  String milk;

    public MilkCoffee(String water, String sugar, String coffee, String milk) {
        super(water, sugar, coffee);
        this.milk = milk;
    }

    public MilkCoffee(Coffee coffee, String milk) {
        super(coffee.getWater(), coffee.getSugar(), coffee.getCoffee());
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Вкусный молочный кофе!";
    }
}

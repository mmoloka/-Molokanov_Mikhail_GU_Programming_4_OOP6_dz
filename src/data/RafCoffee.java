package data;

public class RafCoffee extends Coffee {

    private String syrup;
    private String cream;

    public RafCoffee(Coffee coffee, String syrup, String cream) {
        super(coffee.getWater(), coffee.getSugar(), coffee.getCoffee());
        this.syrup = syrup;
        this.cream = cream;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    @Override
    public String toString() {
        return "Вкусный раф-кофе!";
    }
}

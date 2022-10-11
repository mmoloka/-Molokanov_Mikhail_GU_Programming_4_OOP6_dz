package data;

public class Mocacсino extends Coffee {

    private String chocolate;
    private String cinnamon;

    public Mocacсino(Coffee coffee, String chocolate, String cinnamon) {
        super(coffee.getWater(), coffee.getSugar(), coffee.getCoffee());
        this.chocolate = chocolate;
        this.cinnamon = cinnamon;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public void setCinnamon(String cinnamon) {
        this.cinnamon = cinnamon;
    }

    @Override
    public String toString() {
        return "Вкусный моккачино!";
    }
}

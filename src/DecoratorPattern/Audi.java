package DecoratorPattern;

public class Audi implements Icar{
    private int cost;
    @Override
    public int getPrice() {
        return this.cost;
    }

    public Audi(int cost) {
        this.cost = cost;
    }

    @Override
    public void showPrice() {
        System.out.println("audi의 가격은 : "+this.cost+" 입니다");
    }
}

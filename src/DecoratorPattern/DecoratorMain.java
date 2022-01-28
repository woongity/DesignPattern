package DecoratorPattern;

public class DecoratorMain {
    public static void main(String[] args) {
        Icar audi = new Audi(1000);
        audi.showPrice();

        //a3
        Icar audi3 = new A3(audi,"A3");
        audi3.showPrice();
        //a4
        Icar audi4 = new A4(audi,"A4");
        audi4.showPrice();
        //a5
        Icar audi5 = new A5(audi,"A5");

        audi5.showPrice();
    }
}

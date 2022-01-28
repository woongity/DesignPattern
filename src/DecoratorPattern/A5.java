package DecoratorPattern;

public class A5 extends AudiDecorator{

    public A5(Icar audi, String modelName) {
        super(audi, modelName, 5000);
    }
}

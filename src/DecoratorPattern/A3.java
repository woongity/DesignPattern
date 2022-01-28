package DecoratorPattern;

public class A3 extends AudiDecorator{
    public A3(Icar audi,String modelname){
        super(audi, modelname, 3000);
    }
}

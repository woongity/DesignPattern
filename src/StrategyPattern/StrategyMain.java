package StrategyPattern;

public class StrategyMain {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Encoder encoder1 = new Encoder();
        Encoder encoder2 = new Encoder();
        // base 64
        EncodingStrategy base64 = new Base64Strategy();
        EncodingStrategy normal = new NormalStrategy();
        EncodingStrategy append = new AppendStrategy();
        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        System.out.println(encoder.getMessage(message));

        encoder1.setEncodingStrategy(normal);
        System.out.println(encoder1.getMessage(message));

        encoder2.setEncodingStrategy(append);
        System.out.println(encoder2.getMessage(message));
    }
}

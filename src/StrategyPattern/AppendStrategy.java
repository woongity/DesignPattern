package StrategyPattern;

public class AppendStrategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return "ABCDE"+text;
    }
}

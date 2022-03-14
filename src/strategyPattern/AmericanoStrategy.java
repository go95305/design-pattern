package strategyPattern;

public class AmericanoStrategy implements CoffeeStrategy{
    public final static String AMERICANO = "아메리카노";
    @Override
    public String brew() {
        return AMERICANO;
    }
}

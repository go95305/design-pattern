package strategyPattern;

public class CaffeLatteStrategy implements CoffeeStrategy {
    public static final String CAFFELATTE = "카페라떼";

    @Override
    public String brew() {
        return CAFFELATTE;
    }
}

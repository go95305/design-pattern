package strategyPattern;

public class Road {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        String americano = coffeeMachine.brew(americanoButton());
        System.out.println(americano);

        String caffeLatte = coffeeMachine.brew(caffelatteButton());
        System.out.println(caffeLatte);
    }

    private static CoffeeStrategy caffelatteButton() {
        return new CaffeLatteStrategy();
    }

    private static CoffeeStrategy americanoButton() {
        return new AmericanoStrategy();
    }
}

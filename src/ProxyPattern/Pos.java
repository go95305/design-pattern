package ProxyPattern;

public class Pos implements Review {
    //    private final String FOOD = "Order CHiCKEN";
    private final String REVIEW = "WRITE REVIEW";

    @Override
    public void writeReview() {
        System.out.println(REVIEW);
    }
}

package ProxyPattern;

public class Proxy implements Review {
    Review review = new Pos();

    @Override
    public void writeReview() {
        review.writeReview();
    }
}

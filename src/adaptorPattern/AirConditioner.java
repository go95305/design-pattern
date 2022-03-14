package adaptorPattern;

public class AirConditioner implements Electronic220v {
    @Override
    public void connect() {
        System.out.println("에어컨 220v On");
    }
}

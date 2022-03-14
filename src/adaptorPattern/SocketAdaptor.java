package adaptorPattern;

public class SocketAdaptor implements Electronic110v {
    public Electronic220v electronic220v;

    public SocketAdaptor(Electronic220v electronic220v) {
        this.electronic220v = electronic220v;
    }

    @Override
    public void powerOn() {
        electronic220v.connect();
    }
}

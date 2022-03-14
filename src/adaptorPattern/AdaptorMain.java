package adaptorPattern;

public class AdaptorMain {
    public static void main(String[] args) {
        //110V 짜리 연결
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        //220v 짜리 연결(실패)
        Cleaner cleaner = new Cleaner();
//        connect(cleaner);

        //어댑터 pattern을 이용하여 220v 를 110v으로 연결 및 실행
        AirConditioner airConditioner = new AirConditioner();
        Electronic110v elecAdaptor = new SocketAdaptor(airConditioner);
        connect(elecAdaptor);

    }

    public static void connect(Electronic110v electronic110v){
        electronic110v.powerOn();
    }
}

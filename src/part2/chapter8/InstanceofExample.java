package part2.chapter8;

public class InstanceofExample {
    public static void main(String[] args) {
        //구현 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        //ride() 메소드 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
    }

    private static void ride(Vehivle vehivle) {
        //방법1
        /*if (vehivle instanceof Bus) {
            Bus bus = (Bus) vehivle;
            bus.checkFare();
        }*/
        //매개값이 Bus인 경우에만 강제 타입 변환해서 checkFare() 메소드를 호출

        //방법2
        /*if (vehivle instanceof Bus bus) {
            bus.checkFare();
            //Java 12부터 사용가능
        }*/

        vehivle.run();
    }
}

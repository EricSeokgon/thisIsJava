package part2.chapter6;

public class SingletonExample {
    public static void main(String[] args) {

        //정적 메소드를 호출해서 싱글통 객체 얻음
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        //동일한 객체를 참조하는지 확인
        if (singleton1 == singleton2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}

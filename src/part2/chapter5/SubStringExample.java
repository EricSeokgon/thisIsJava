package part2.chapter5;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstnum = ssn.substring(0, 6);
        System.out.println(firstnum);

        String seconNum = ssn.substring(7);
        System.out.println(seconNum);

    }
}

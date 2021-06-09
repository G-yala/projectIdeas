package Cube;

public class Main {
    public static void main(String[] main) {
        Cube oShit = new Cube(4);

        System.out.println(oShit.volume());
        System.out.println(oShit);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }

}

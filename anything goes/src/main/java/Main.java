import java.util.Scanner;

public class Main {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
//        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }
}

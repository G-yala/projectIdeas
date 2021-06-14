import java.util.Scanner;

public class TextUI {
    Scanner scanner;
    Dictionary dictionary;
    public TextUI(Scanner scanner, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (input.equals("add")) {
                System.out.println("Word");
                String word = scanner.nextLine();
                //"ask for the translation"
                System.out.println("Translation");
                String translation = scanner.nextLine();
                //add it to the dictionary
                dictionary.add(word,translation);

            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String search = scanner.nextLine();

                if (dictionary.translate(search) == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println(dictionary.translate(search));
                }
            } else {
                System.out.println("Unknown Command");
            }
        }
    }
}

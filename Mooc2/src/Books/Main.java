package Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a book with a title, page numbers, and year published, empty book exits app");
        System.out.println("Should be seperated by a comma, eg: Captain Underpants, 69, 1996");

        while (true) {
            System.out.println("Enter favorite book title, pages, and published year");
            String bookInfo = scanner.nextLine();
            if (bookInfo.isEmpty()) {
                break;
            }

            String[] splitted = bookInfo.split(", ");
            String title = splitted[0];
            int pages = Integer.valueOf(splitted[1]);
            int year = Integer.valueOf(splitted[2]);

            book.add(new Books(title, pages, year));
        }

        System.out.println("Enter 'everything' to get all book information else enter 'name'");
        String userInput = scanner.nextLine();

        for (Books info : book) {
            if (userInput.equals("everything")) {
                System.out.println(info.getAll());
            } else {
                System.out.println(info.getName());
            }
        }
    }
}

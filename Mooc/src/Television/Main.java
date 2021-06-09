package Television;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Television> showList = new ArrayList<>();
        System.out.println("Name a show/movie and add the minutes in duration seperated by a comma, for example: The Simpsons, 25");
        while (true) {
            System.out.println("Enter the details, empty will stop: ");
            String show = scanner.nextLine();
            if (show.isEmpty()) {
                break;
            }

            String[] splitted = show.split(", ");
            String showName = splitted[0];
            int duration = Integer.valueOf(splitted[1]);
            showList.add(new Television(showName,duration));

        }

        System.out.println("Whats your duration limit?");
        int durationMax = Integer.valueOf(scanner.nextLine());

        for (Television show : showList) {
            if (show.getDuration() <= durationMax) {
                System.out.println(show);
            }
        }
//        System.out.println("Total number of shows: " + showList.size());

    }
}

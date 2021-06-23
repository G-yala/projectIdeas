import java.util.Scanner;

public class Main {
    public static void main(String[] main) {
        TodoLIst list = new TodoLIst();
        Scanner scanner = new Scanner(System.in);

        ScannerUserInterface ui = new ScannerUserInterface(list, scanner);
        ui.start();
    }
}

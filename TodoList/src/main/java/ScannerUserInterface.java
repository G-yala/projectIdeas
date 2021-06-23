import java.util.Scanner;

public class ScannerUserInterface {
    private TodoLIst todoList;
    private Scanner scanner;

    public ScannerUserInterface(TodoLIst todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    public void start() {

        while(true) {
            System.out.println("Command: ");
            String string = scanner.nextLine();

            if (string.equals("stop")) {
                break;
            }
            if (string.equals("add")){
                System.out.println("To add: ");
                String add = scanner.nextLine();
                todoList.add(add);
            }
            if (string.equals("list")) {
                todoList.print();
            }
            if (string.equals("remove")) {
                System.out.println("Which one is removed?");
                Integer id = Integer.valueOf(scanner.nextLine());
                todoList.remove(id);
            }
        }
        return;
    }
}

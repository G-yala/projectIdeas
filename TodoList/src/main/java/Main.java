public class Main {
    public static void main(String[] main) {
        TodoLIst list = new TodoLIst();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print("Testing1234");
    }

}

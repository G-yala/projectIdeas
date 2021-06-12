public class Main {
    public static void main(String[] main) {
        Collection j = new Collection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());

    }
}

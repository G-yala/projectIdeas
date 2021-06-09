public class Main {
    public static void main(String[] args) {
        Counter counting = new Counter();

        //counting.value()
        System.out.println(counting.value());
        counting.increase();
        System.out.println(counting);
        counting.increase();
        counting.increase();
        counting.decrease();
        System.out.println(counting);
        counting.increase(69);
        System.out.println(counting);
        counting.decrease(33);
        System.out.println(counting);
      
    }
}

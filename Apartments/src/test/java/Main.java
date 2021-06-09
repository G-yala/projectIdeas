public class Main {
    public static void main(String[] main) {
        Apartment manhattan = new Apartment(1,16,5500);
        Apartment atlanta = new Apartment(2,38,4200);
        Apartment losAngeles = new Apartment(3,78, 2500);

        System.out.println(manhattan.largerThan(atlanta));
        System.out.println(losAngeles.largerThan(atlanta));

        System.out.println("");

        System.out.println(manhattan.priceDifference(atlanta));
        System.out.println(losAngeles.priceDifference(atlanta));

        System.out.println("");

        System.out.println(manhattan.moreExpensiveThan(atlanta));
        System.out.println(losAngeles.moreExpensiveThan(atlanta));
    }
}

public class Main {
    public static void main(String[] args) {

        HealthStation childrenHospital = new HealthStation();

        Person ethan = new Person("Ethan",1,110,7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + " weight: " + childrenHospital.weigh(ethan) + " pounds");
        System.out.println(peter.getName() + " weight: " + childrenHospital.weigh(peter) + " pounds");

        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);

        System.out.println("");

        System.out.println(ethan.getName() + " weight: " + childrenHospital.weigh(ethan) + " pounds");
        System.out.println(peter.getName() + " weight: " + childrenHospital.weigh(peter) + " pounds");

        System.out.println("weighings performed: " + childrenHospital.weighings());

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(peter);

        System.out.println("weighings performed: " + childrenHospital.weighings());

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrenHospital.weighings());
    }
}

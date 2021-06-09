public class HealthStation {
    private int counterWeighins = 0;

    public int weigh(Person person) {
        counterWeighins++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return counterWeighins;
    }

}

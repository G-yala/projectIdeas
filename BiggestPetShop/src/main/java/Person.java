public class Person {
    private String name;
    private Pet pet;
//    private Pet breed;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
//        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public Pet getPet() {
        return this.pet;
    }

    public String toString() {
        return this.name + ", has a friend called " + getPet().petName + "(" + getPet().petBreed + ")" ;
    }
}
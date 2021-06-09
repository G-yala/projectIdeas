public class Pet {
    String petName;
    String petBreed;
    public Pet(String name, String petBreed) {
        this.petName = name;
        this.petBreed = petBreed;
    }

    public String getPetName() {
        return this.petName;
    }

    public String getPetBreed() {
        return this.petBreed;
    }
}

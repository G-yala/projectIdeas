import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int height) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Person other = (Person) obj;

        if (this.height != other.height) {
            return false;
        }

        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}

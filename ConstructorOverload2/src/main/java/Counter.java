public class Counter {
    private int starter;

    public Counter(int starter) {
        this.starter = starter;
    }

    public Counter() {
        this.starter = 0;
    }

    public int value() {
        return this.starter;
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease() {
        this.decrease(1);
    }

    public void increase(int increasedBy) {
        this.starter += increasedBy;
    }

    public void decrease(int decreasedBy) {
        this.starter -= decreasedBy;
    }

    public String toString() {
        return "this is the value " + this.starter;
    }
}

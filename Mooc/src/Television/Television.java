package Television;

public class Television {
    private String showName;
    private int duration;

    public Television(String showName, int duration) {
        this.showName = showName;
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    public String toString() {
        return "Show Name: " + this.showName + "\n" + "Duration: " + this.duration + " minutes";
    }

}

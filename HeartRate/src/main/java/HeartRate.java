package HeartRate;

public class HeartRate {
    private int age;
    private int hr;

    public HeartRate(int age, int hr) {
        this.age = age;
        this.hr = hr;
    }

    public double targetHeartRate(double percentageOfMax) {
        return 206.3 - (0.711 * age);
    }


}

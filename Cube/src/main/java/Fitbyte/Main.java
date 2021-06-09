package Fitbyte;

public class Main {
    public static void main(String[] main) {
        Fitbyte assistant = new Fitbyte(30,60);

        double percentage = .05;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage += .01;
        }
    }


}

public class Main {
    public static void main(String[] main) {
        SimpleDate date = new SimpleDate(13,2,2015);
        System.out.println("exam week is " + date.toString());

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;

        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week++;
        }
        System.out.println("the day after 790 days from examined friday is " + date.afterNumberOfDays(790));
    }
}

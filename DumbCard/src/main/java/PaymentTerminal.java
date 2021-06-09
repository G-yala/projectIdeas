public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;

        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            this.money += (payment - 2.50);
            this.affordableMeals++;
            return payment -= 2.50;
        }
        return payment;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public int getAffordableMeals() {
        return this.affordableMeals;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            this.money += (payment - 4.30);
            this.heartyMeals++;
            return payment -= 4.30;
        }

        return payment;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public int getHeartyMeals() {
        return this.heartyMeals++;
    }

    public boolean eatAffordably(DumbCard card) {
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            return true;
        }

        return false;
    }

    public boolean eatHeartily(DumbCard card) {
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            return true;
        }

        return false;
    }

    public void addMoneyToCard(DumbCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
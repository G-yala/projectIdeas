public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros,this.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros
            && this.cents > compared.cents) {
            return true;
        }
        return false;
    }

    public minus(Money decreaser) {
        Money newerMoney = new Money(this.euros(),this.cents());

        if (newerMoney)
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";

        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}

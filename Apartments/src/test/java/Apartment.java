public class Apartment {
    private int rooms;
    private int squares;
    private int pricerPerSquare;

    public Apartment(int rooms, int squares, int pricerPerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricerPerSquare = pricerPerSquare;
    }

    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared) {
        int tempPrice = this.pricerPerSquare * this.squares;
        int tempCompared = compared.pricerPerSquare * compared.squares;

        return Math.abs(tempPrice - tempCompared);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.pricerPerSquare * this.squares) > (compared.pricerPerSquare * compared.squares)) {
            return true;
        }

        return false;
    }

}

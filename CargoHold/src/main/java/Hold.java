import java.util.ArrayList;

public class Hold {
    private int weight;
    private ArrayList<Suitcase> hodl;

    public Hold(int weight) {
        this.weight = weight;
        this.hodl = new ArrayList<Suitcase>();
    }

    public int sumWeight() {
        int sumWeight = 0;

        for (Suitcase e : hodl) {
            sumWeight += e.totalWeight();
        }
        return sumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {

        if (suitcase.totalWeight() <= this.weight) {
            hodl.add(suitcase);
        } else {
            return;
        }
    }

    public void printItems() {
        for (Suitcase stuff : hodl) {
            stuff.printItems();
        }
    }

    public String toString() {
        return this.hodl.size() + " suitcases (" + sumWeight() + "kg)";
    }
}

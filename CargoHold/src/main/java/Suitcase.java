import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int sumWeight = 0;

        for (Item el : items) {
            sumWeight += el.getWeight();
        }
        return sumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        } else {
            return;
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + "kg)");
        }
    }

    public Item heaviestItem() {
        if (items.size() == 0) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item e : items) {
            if (e.getWeight() > heaviest.getWeight()) {
                heaviest = e;
            }
        }

        return heaviest;
    }

    public String toString() {

        if (this.items.size() == 0) {
            return "no items (" + this.totalWeight() + "kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + "kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + "kg)";
        }

//        return this.items.size() + " items (" + this.totalWeight() + "kg)";
    }
}

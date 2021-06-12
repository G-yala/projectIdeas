import java.lang.reflect.Array;
import java.util.ArrayList;

public class Collection {
    private String name;
    private ArrayList<String> stuffs;

    public Collection(String name) {
        this.name = name;
        this.stuffs = new ArrayList<>();
    }

    public void add(String element) {
        this.stuffs.add(element);
    }

    public ArrayList<String> getStuffs() {
        return this.stuffs;
    }

    public String toString() {
        String stringOutput = "";

        String listOfStuffs = "";


        for (String el : stuffs) {

            if (el.equals(stuffs.get(stuffs.size() - 1))) {
                listOfStuffs += el;
            } else {
                listOfStuffs += el + "\n";
            }
        }

        if (stuffs.size() == 1) {
            stringOutput = "The collection " + this.name + " has 1 element: \n" + listOfStuffs;
        } else if (stuffs.size() == 0) {
            stringOutput = "The collection " + this.name + " is empty.";
        } else {
            stringOutput = "The collection " + this.name + " has " + stuffs.size() + " elements:\n" + listOfStuffs;
        }

        return stringOutput;
    }

}

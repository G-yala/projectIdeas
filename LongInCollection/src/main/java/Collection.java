import java.util.ArrayList;

public class Collection {
    String name;
    private ArrayList<String> elements;

    public Collection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestString = this.elements.get(0);

        for (String el : elements) {
            if (el.length() > longestString.length()) {
                longestString = el;
            }
        }
        return longestString;
    }
}

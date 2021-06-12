import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {

        boolean isEmpty = false;

        if (this.stack.isEmpty()) {
            isEmpty = true;
        }

        return isEmpty;
    }

    public void add(String value) {
        this.stack.add(0, value);
    }

    public ArrayList<String> values() {
        return this.stack;

    }

    public String take() {
        int length = this.stack.size();
        return this.stack.remove(length - 1);
    }

}

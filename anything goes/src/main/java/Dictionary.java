import java.util.HashMap;

public class Dictionary {
        private HashMap<String,String> translations;

        public Dictionary() {
            this.translations = new HashMap<>();
        }

        public String translate(String word) {
            return this.translations.get(word);
        }

        public void add(String word, String translation) {
            this.translations.put(word, translation);
        }


}

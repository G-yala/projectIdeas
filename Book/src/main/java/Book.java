public class Book {
    private String author;
    private String titleName;
    private int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.titleName = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitleName() {
        return this.titleName;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.author + ", " + this.titleName + ", " + this.pages + " pages";
    }
}

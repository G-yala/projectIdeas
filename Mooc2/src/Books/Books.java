package Books;

public class Books {
    String bookName;
    int bookPages;
    int yearPublished;

    public Books(String name, int pages, int year){
        this.bookName = name;
        this.bookPages = pages;
        this.yearPublished = year;
    }

    public String getAll() {
        return this.bookName + ", " + this.bookPages + " pages, " + this.yearPublished;
    }

    public String getName() {
        return this.bookName;
    }
}

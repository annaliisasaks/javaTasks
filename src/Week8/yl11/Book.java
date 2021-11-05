package Week8.yl11;

public class Book implements ToBeStored {
    private String author;
    private String title;
    private double bookWeight;

    public Book(String writer, String name, double weight) {
        this.author = writer;
        this.title = name;
        this.bookWeight = weight;
    }

    public double weight() {
        return this.bookWeight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.title;
    }
}

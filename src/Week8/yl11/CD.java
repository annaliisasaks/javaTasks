package Week8.yl11;

public class CD implements ToBeStored {
    private String artist;
    private String cdTitle;
    private int publishYear;
    private double cdWeight;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.cdTitle = title;
        this.publishYear = year;
        this.cdWeight = 0.1;
    }

    public double weight() {
        return this.cdWeight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.cdTitle + " (" + this.publishYear + ")";
    }
}

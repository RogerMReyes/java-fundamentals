package inheritance;

public class Review {
    private String author;
    private String text;
    private int numOfStars;

    public Review(String author, String text, int numOfStars) {
        this.author = author;
        this.text = text;
        this.numOfStars = numOfStars;
    }

    @Override
    public String toString() {
        String response = author + " " + text + " " + numOfStars;
        return response;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public int getNumOfStars() {
        return numOfStars;
    }
}

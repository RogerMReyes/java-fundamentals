package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String price;
    private int numOfStars = 0;
    private ArrayList<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        String response = name + " " + price + " " +numOfStars;
        return response;
    }

    public void addReview(Review input){
        reviewList.add(input);
        updateStars(input.getNumOfStars());
    }

    public void updateStars(int stars){
        if(numOfStars == 0){
            numOfStars = stars;
        }
        else {
            int sum = 0;
            for(Review review : reviewList){
                sum += review.getNumOfStars();
            }
            numOfStars = sum/reviewList.size();
        }
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

}

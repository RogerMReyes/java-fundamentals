package inheritance.Business;

import inheritance.Review.Review;

import java.util.ArrayList;

public abstract class Business {
    protected String name;
    protected String price;
    protected int numOfStars = 0;
    protected ArrayList<Review> reviewList = new ArrayList<>();


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

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }
}



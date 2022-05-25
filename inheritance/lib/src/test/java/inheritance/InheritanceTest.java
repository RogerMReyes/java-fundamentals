package inheritance;

import inheritance.Business.Restaurant;
import inheritance.Business.Shop;
import inheritance.Business.Theater;
import inheritance.Review.RestaurantReview;
import inheritance.Review.Review;
import inheritance.Review.ShopReview;
import inheritance.Review.TheaterReview;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {
    Restaurant newRestaurant = new Restaurant("Pizza Palace", "$$");
    RestaurantReview newReview = new RestaurantReview("Roger", "This place not good", 2);
    RestaurantReview newReview2 = new RestaurantReview("Roger", "This place okay", 4);

    @Test
    void restaurantConstructorReturnsNameAndPrice() {
        assertSame("Pizza Palace", newRestaurant.getName());
        assertSame("$$", newRestaurant.getPrice());
    }

    @Test
    void restaurantToStringReturnsData() {
        assertEquals("Pizza Palace $$ 0" ,newRestaurant.toString());
    }

    @Test
    void reviewConstructorReturnsInputs() {
        assertSame("Roger", newReview.getAuthor());
        assertSame("This place not good", newReview.getText());
        assertEquals(2, newReview.getNumOfStars());
    }

    @Test
    void reviewToStringReturnsData() {
        assertEquals("author: Roger text: This place not good numOfStars: 2", newReview.toString());
    }

    @Test
    void restaurantArrayListReturnsUpdated() {
        newRestaurant.addReview(newReview);
        Review checkReview = newRestaurant.getReviewList().get(0);
        assertEquals("author: Roger text: This place not good numOfStars: 2", checkReview.toString());
    }

    @Test
    void restaurantNumOfStarsReturnsUpdatedStars() {
        newRestaurant.addReview(newReview);
        newRestaurant.addReview(newReview2);
        assertEquals(3, newRestaurant.getNumOfStars());
    }

    @Test
    void ShopClassConstructorAndReviewMethodsWork() {
        Shop newShop = new Shop("Target", "$$$", "We are fancy Walmart");
    }

    @Test
    void TheaterClassAddsAndRemovesMovies() {
        Theater newTheater = new Theater("Regal");
        newTheater.addMovie("Aladdin");
        newTheater.addMovie("Transformers");
        assertEquals("[Aladdin, Transformers]", newTheater.getMovieList().toString());
        newTheater.removeMovie("Aladdin");
        assertEquals("[Transformers]", newTheater.getMovieList().toString());
    }

    @Test
    void TheaterHoldsReviews() {
        Theater newTheater = new Theater("Regal");
        TheaterReview review = new TheaterReview("Roger","Aladdin","This is classic", 5);
        TheaterReview review2 = new TheaterReview("Roger","Transformers","Go Boom", 4);
        newTheater.addReview(review);
        newTheater.addReview(review2);
        assertEquals("author: Roger movie: Aladdin text: This is classic numOfStars: 5", newTheater.getReviewList().get(0).toString());
        assertEquals(4, newTheater.getNumOfStars());
    }
}

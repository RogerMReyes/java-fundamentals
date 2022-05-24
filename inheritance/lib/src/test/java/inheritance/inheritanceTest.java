package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class inheritanceTest {
    Restaurant newRestaurant = new Restaurant("Pizza Palace", "$$");
    Review newReview = new Review("Roger", "This place not good", 2);
    Review newReview2 = new Review("Roger", "This place okay", 4);

    @Test
    void restaurantConstructorReturnsNameAndPrice() {
        assertTrue(newRestaurant.getName() == "Pizza Palace");
        assertTrue(newRestaurant.getPrice() == "$$");
    }

    @Test
    void restaurantToStringReturnsData() {
        assertEquals("Pizza Palace $$ 0" ,newRestaurant.toString());
    }

    @Test
    void reviewConstructorReturnsInputs() {
        assertTrue(newReview.getAuthor() == "Roger");
        assertTrue(newReview.getText() == "This place not good");
        assertTrue(newReview.getNumOfStars() == 2);
    }

    @Test
    void reviewToStringReturnsData() {
        assertEquals("Roger This place not good 2", newReview.toString());
    }

    @Test
    void restaurantArrayListReturnsUpdated() {
        newRestaurant.addReview(newReview);
        Review checkReview = newRestaurant.getReviewList().get(0);
        assertEquals("Roger This place not good 2", checkReview.toString());
    }

    @Test
    void restaurantNumOfStarsReturnsUpdatedStars() {
        newRestaurant.addReview(newReview);
        newRestaurant.addReview(newReview2);
        assertEquals(3, newRestaurant.getNumOfStars());
    }
}

package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {
    Restaurant newRestaurant = new Restaurant("Pizza Palace", "$$");
    Review newReview = new Review("Roger", "This place not good", 2);
    Review newReview2 = new Review("Roger", "This place okay", 4);

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

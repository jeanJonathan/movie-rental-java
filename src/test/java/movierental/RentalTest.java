package movierental;

import junit.framework.TestCase;

public class RentalTest extends TestCase {

    public void test_GetDaysRented() {
        Rental rental = new Rental(new Movie("Jaws", new RegularPrice()), 2);
        assertEquals(2,rental.getDaysRented());
    }

    public void test_GetMovie() {
        Rental rental = new Rental(new Movie("Jaws", new RegularPrice()), 2);
        assertEquals("Jaws",rental.getMovie().getTitle());
    }

    public void test_GetChargeRental_for_() {
        Rental rental = new Rental(new Movie("Jaws", new NewReleasePrice()), 2);
        assertEquals(6.0,rental.getChargeRental());
    }
}
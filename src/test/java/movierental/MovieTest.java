package movierental;

import junit.framework.TestCase;

public class MovieTest extends TestCase {

    public void test_GetCharge() {
        Movie movie = new Movie("Jaws", new NewReleasePrice());
        assertEquals(6.0,movie.getCharge(2));
    }

    public void test_GetTitle() {
        Movie movie = new Movie("Jaws", new RegularPrice());
        assertEquals("Jaws",movie.getTitle());
    }

    public void test_getPrice_for_regularPrice() {
        Movie movie = new Movie("Jaws", new RegularPrice());
        assertEquals(2.0,movie.getPrice().getCharge(2));
    }
}
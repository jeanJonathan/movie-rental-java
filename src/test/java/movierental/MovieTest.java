package movierental;

import junit.framework.TestCase;

public class MovieTest extends TestCase {

    public void testGetCharge() {
        Movie movie = new Movie("Jaws", new NewReleasePrice());
        assertEquals(6,movie.getCharge(2));
    }

    public void testGetTitle() {
        Movie movie = new Movie("Jaws", new RegularPrice());
        assertEquals("Jaws",movie.getTitle());
    }

    public void test_getPrice_for_regularPrice() {
        Movie movie = new Movie("Jaws", new RegularPrice());
        assertEquals(2,movie.getPrice());
    }
}
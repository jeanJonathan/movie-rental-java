package movierental;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import org.junit.Test;

public class CustomerTest {

    @Test
    public void test_regular_price() {
        //Githen
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("Jaws", new RegularPrice()), 2));
        customer.addRental(new Rental(new Movie("Golden Eye", new RegularPrice()), 3));

        //When
        String expected = "" +
                "Rental Record for Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "Amount owed is 5.5\n" +
                "You earned 2 frequent renter points";
        //Then
        assertEquals(expected, customer.statement());
    }
    @Test
    public void test_new_release_price() {
        //Given
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("Short New", new NewReleasePrice()), 1));
        customer.addRental(new Rental(new Movie("Long New", new NewReleasePrice()), 2));

        //When
        String expected = "" +
                "Rental Record for Bob\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 3 frequent renter points";
        //Then
        assertEquals(expected, customer.statement());
    }
    @Test
    public void test_childrens_price() {
        //Given
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("Bambi", new ChildrensPrice()), 3));
        customer.addRental(new Rental(new Movie("Toy Story", new ChildrensPrice()), 4));

        //When
        String expected = "" +
                "Rental Record for Bob\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 4.5\n" +
                "You earned 2 frequent renter points";
        //Then
        assertEquals(expected, customer.statement());
    }
}
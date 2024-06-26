package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public double calculateAmount(Rental rental) {
        return rental.getChargeRental();
    }

    public int calculateFrequentRenterPoints(Rental rental){
        if ((rental.getMovie().getPrice() instanceof NewReleasePrice) && rental.getDaysRented() > 1){
            return 2;
        }
        return 1;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : _rentals) {
            double thisAmount = calculateAmount(each);
            // add frequent renter points
            frequentRenterPoints += calculateFrequentRenterPoints(each);

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }
}

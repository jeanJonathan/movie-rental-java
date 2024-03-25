package movierental;

public class NewReleasePrice implements Price {
    public double getCharge(int daysRented) {
        double result = 0;
        result += daysRented * 3;
        return result;
    }
}



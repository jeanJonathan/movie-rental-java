package movierental;

public class Movie {
    //Reference pour la classe Price
    Price _price;
    private String _title;

    public Movie(String title, Price price) {
        _title = title;
        _price = price;
    }
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    public String getTitle() {
        return _title;
    }
    Price getPrice() {
            return _price;
    }
}

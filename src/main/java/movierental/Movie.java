package movierental;

public class Movie {
    //Reference pour la classe Price
    Price _price;
    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

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

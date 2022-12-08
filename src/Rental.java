public class Rental {
    private Movie _movie;
    private int _daysRented;
    private int frequentRenterPoints;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
    public int getFrequentRenterPoints(Rental each){
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                each.getDaysRented() > 1) frequentRenterPoints ++;
        return 0;
    }
    public double getCharge(){

        return 0;
    }
}

public  class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    public double getCharge(int dayRented) {
       double result = 2;
       if (dayRented > 2)
           result += (dayRented - 2) * 1.5;
       return result;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
public abstract class Price{
    public abstract double getCharge(int dayRented);

    public int getFrequentRenterPoints(int daysRented){

        return daysRented;
    }

    public abstract int getPrideCode();
}

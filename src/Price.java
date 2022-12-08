public abstract class Price{
    public abstract double getCharge(int dayRented);

    public int getFrequentRenterPoints(int daysRented){

        return 1;
    }

    public abstract int getPrideCode();
}

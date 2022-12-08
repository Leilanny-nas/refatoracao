public class Movie<_title> {
        public static final int  CHILDRENS = 2;
        public static final int  REGULAR = 0;
        public static final int  NEW_RELEASE = 1;

        private String _title;
        private Price _price;

        public Movie(String name, int priceCode) {
            _title = name;
            setPriceCode(priceCode);
        }

        public int getPriceCode() {
            return _price.getPrideCode();
        }

        public void setPriceCode(int arg) {
           switch (arg){
               case REGULAR:
                   _price = new RegularPrice() {
                       @Override
                       public int getPrideCode() {
                           return 0;
                       }
                   };
                   break;
               case CHILDRENS:
                   _price = new ChildrensPrice() {
                       @Override
                       public int getPrideCode() {
                           return 0;
                       }
                   };
                   break;
               case NEW_RELEASE:
                   _price = new NewReleasePrice() {
                       @Override
                       public int getPrideCode() {
                           return 0;
                       }
                   };
                   break;
               default:
                   throw new IllegalArgumentException("Incorrect Price Code");
           }
        }

        public String getTitle (){
            return _title;
        }
        public double getCharge(int daysRented){
            return _price.getCharge(daysRented);
        }

    public int getFrequentRenterPoint(int daysRented) {

        return daysRented;
    }
}


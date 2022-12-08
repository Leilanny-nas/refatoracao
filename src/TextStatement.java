import java.beans.Statement;
import java.util.Enumeration;

public class TextStatement extends Statement {
    /**
     * Creates a new {@link Statement} object
     * for the specified target object to invoke the method
     * specified by the name and by the array of arguments.
     * <p>
     * The {@code target} and the {@code methodName} values should not be {@code null}.
     * Otherwise an attempt to execute this {@code Expression}
     * will result in a {@code NullPointerException}.
     * If the {@code arguments} value is {@code null},
     * an empty array is used as the value of the {@code arguments} property.
     *
     * @param target     the target object of this statement
     * @param methodName the name of the method to invoke on the specified target
     * @param arguments  the array of arguments to invoke the specified method
     */
    public TextStatement(Object target, String methodName, Object[] arguments) {
        super(target, methodName, arguments);
    }

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "Rental Record for " + aCustomer.getName() +
                "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
        return result;
    }
}

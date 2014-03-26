package cmput301.refactoring.exercise2;


/**
 * @see cmput301.refactoring.exercise2.Movie#NEW_RELEASE
 */
public class NewRelease extends PriceCode
{

	public double getCharge(double result, Rental rental)
	{

		result += rental.getDaysRented() * 3;
		return result;
	}
}
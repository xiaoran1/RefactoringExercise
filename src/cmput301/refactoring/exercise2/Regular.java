package cmput301.refactoring.exercise2;


/**
 * @see cmput301.refactoring.exercise2.Movie#REGULAR
 */
public class Regular extends PriceCode
{

	public double getCharge(double result, Rental rental)
	{

		result += 2;
		if (rental.getDaysRented() > 2)
			result += (rental.getDaysRented() - 2) * 1.5;
		return result;
	}
}
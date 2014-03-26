package cmput301.refactoring.exercise2;


/**
 * @see cmput301.refactoring.exercise2.Movie#CHILDRENS
 */
public class Childrens extends PriceCode
{

	public double getCharge(double result, Rental rental)
	{

		result += 1.5;
		if (rental.getDaysRented() > 3)
			result += (rental.getDaysRented() - 3) * 1.5;
		return result;
	}
}
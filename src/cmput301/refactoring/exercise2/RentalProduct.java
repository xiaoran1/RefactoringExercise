package cmput301.refactoring.exercise2;


public class RentalProduct
{

	public PriceCode getPriceCodeObject(int _priceCode)
	{

		switch (_priceCode)
		{
			case Movie.REGULAR:
				return new Regular();
			case Movie.NEW_RELEASE:
				return new NewRelease();
			case Movie.CHILDRENS:
				return new Childrens();
		}
		return null;
	}

	public double getCharge(int _priceCode, Rental rental)
	{

		double result = 0;
		result = getPriceCodeObject(_priceCode).getCharge(result, rental);
		return result;
	}
}
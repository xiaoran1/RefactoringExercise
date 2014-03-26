package cmput301.refactoring.exercise2;


public class MovieProduct
{

	private int _priceCode;

	public int get_priceCode()
	{

		return _priceCode;
	}

	public void set_priceCode(int _priceCode)
	{

		this._priceCode = _priceCode;
	}

	public int getFrequentRenterPoints(int _daysRented)
	{

		if ((_priceCode == Movie.NEW_RELEASE) && _daysRented > 1)
			return 2;
		else
			return 1;
	}
}
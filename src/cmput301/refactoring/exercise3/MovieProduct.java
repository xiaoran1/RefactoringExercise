package cmput301.refactoring.exercise3;


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

	public double getCharge(int _daysRented)
	{

		double result = 0;
		switch (_priceCode)
		{
			case Movie.REGULAR:
				result += 2;
				if (_daysRented > 2)
					result += (_daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += _daysRented * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (_daysRented > 3)
					result += (_daysRented - 3) * 1.5;
				break;
		}
		return result;
	}

	public int getFrequentRenterPoints(int _daysRented)
	{

		if ((_priceCode == Movie.NEW_RELEASE) && _daysRented > 1)
			return 2;
		else
			return 1;
	}
}
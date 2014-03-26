package cmput301.refactoring.exercise2;

public class Rental {
	private RentalProduct rentalProduct = new RentalProduct();
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

    public double getCharge() {
        return _movie.getCharge(this);
    }

    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }

	public double getCharge(int _priceCode)
	{

		return rentalProduct.getCharge(_priceCode, this);
	}
}

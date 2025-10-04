// does not own the logic related to points, rental : low cohesion
public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented){
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie(){
        return movie;
    }

    public double getAmount(){
        return movie.calculateAmount(daysRented);
    }

    public int getFrequentRenterPoints(){
        return movie.calculateFrequentPoints(daysRented);
    }
}
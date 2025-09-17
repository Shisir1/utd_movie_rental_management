public class Movie {

    private final String title;
    private final Price price;

    public Movie(String title, Price price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public double calculateAmount(int daysRented) {
        return price.calculateAmount(daysRented);
    }

    public int calculateFrequentPoints(int daysRented) {
        return price.calculateFrequentRenterPoints(daysRented);
    }

}
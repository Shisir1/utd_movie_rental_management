import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }

    public void addRental(Rental rental){
        rentals.add(rental);
    }

    public String getName(){
        return name;
    }

    public List<Rental> getRentals(){
        return Collections.unmodifiableList(rentals);
    }
}
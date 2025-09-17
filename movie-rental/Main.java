public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Shisir Humagain");

        Movie movie1 = new Movie("Intersteller", new RegularPrice());
        Movie movie2 = new Movie("WarFare", new NewReleasePrice());
        Movie movie3 = new Movie("Snow White", new ChildrenPrice());

        customer.addRental(new Rental(movie1, 3));
        customer.addRental(new Rental(movie2, 2));
        customer.addRental(new Rental(movie3, 4));

        StatementFormatter formatter = new StatementFormatter();

        System.out.println(formatter.generateTextStatement(customer));
        //System.out.println("\n---HTML Version ---\n");
        //System.out.println(formatter.generateHtmlStatement(customer));
    }
}

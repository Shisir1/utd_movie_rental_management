public class StatementFormatter {

    public String generateTextStatement(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");

        for (Rental rental : customer.getRentals()) {
            double thisAmount = rental.getAmount();
            frequentRenterPoints += rental.getFrequentRenterPoints();

            result.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(thisAmount)
                    .append("\n");

            totalAmount += thisAmount;
        }

        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

        return result.toString();
    }

//    // Example: extensible for other formats
//    public String generateHtmlStatement(Customer customer) {
//        double totalAmount = 0;
//        int frequentRenterPoints = 0;
//        StringBuilder result = new StringBuilder("<h1>Rental Record for " + customer.getName() + "</h1>\n<ul>");
//
//        for (Rental rental : customer.getRentals()) {
//            double thisAmount = rental.getAmount();
//            frequentRenterPoints += rental.getFrequentRenterPoints();
//
//            result.append("\n<li>").append(rental.getMovie().getTitle())
//                    .append(" - ").append(thisAmount).append("</li>\n");
//
//            totalAmount += thisAmount;
//        }
//
//        result.append("</ul>");
//        result.append("\n<p>Amount owed is <b>").append(totalAmount).append("</b></p>");
//        result.append("\n<p>You earned <b>").append(frequentRenterPoints).append("</b> frequent renter points</p>");
//
//        return result.toString();
//    }

    public String generateXmlStatement(Customer customer){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder();

        result.append("<rentalStatement>\n");
        result.append("     <customer>").append(customer.getName()).append("</customer\n");
        result.append("     <rentals>\n");

        for (Rental rental : customer.getRentals()) {
            double thisAmount = rental.getAmount();
            frequentRenterPoints += rental.getFrequentRenterPoints();

            result.append("         <rental>\n");
            result.append("             <movie>").append(rental.getMovie().getTitle()).append("</movie>\n");
            result.append("             <amount>").append(thisAmount).append("</amount>\n");
            result.append("         </rental>\n");

            totalAmount += thisAmount;
        }

        result.append("     </rentals>\n");
        result.append("     <totalAmount>").append(totalAmount).append("</totalAmount>\n");
        result.append("     <frequentRenterPoints>").append(frequentRenterPoints).append("</frequentRenterPoints>\n");
        result.append("</rentalStatement>");

        return result.toString();
    }
}


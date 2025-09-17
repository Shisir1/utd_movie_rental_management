public class RegularPrice extends Price{
    private static final double BASE_CHARGE = 2.0;
    private static int BASE_DAYS = 2;
    private static final double EXTRA_CHARGE_PER_DAY = 1.5;

    @Override
    public double calculateAmount(int daysRented) {
        double amount = BASE_CHARGE;
        if(daysRented > BASE_DAYS){
            amount += (daysRented - BASE_DAYS) * EXTRA_CHARGE_PER_DAY;
        }

        return amount;
    }
}

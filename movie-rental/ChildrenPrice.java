public class ChildrenPrice extends Price{
    private static final double BASE_CHARGE = 1.5;
    private static final int BASE_DAYS = 3;
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

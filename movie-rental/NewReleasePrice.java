public class NewReleasePrice extends Price{
    private static final double CHARGE_PER_DAY = 3.0;
    private static final int BONUS_THRESHHOLD = 1;
    private static final int BONUS_POINTS = 2;

    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * CHARGE_PER_DAY;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented){
        return (daysRented > BONUS_THRESHHOLD) ? BONUS_POINTS : 1;
    }
}

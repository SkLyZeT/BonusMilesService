public class BonusMilesService {

    public int calculate(int price) {
        if (price <= 1000) {
            return 0;
        } else {
            int BonusMiles = price / 20;
            return (BonusMiles);
        }
    }
}
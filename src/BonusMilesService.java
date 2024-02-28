public class BonusMilesService {

    public int calculate(int Price) {
        if (Price < 10000) {
            return 0;
        } else {
            int BonusMiles = Price / 20;
            return calculate(Price - BonusMiles * 20) + BonusMiles;
        }
    }
}
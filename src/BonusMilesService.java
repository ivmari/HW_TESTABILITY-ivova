public class BonusMilesService {
    int rublesForOneBonusMile = 20;

    public int calculate(int price) {
        int miles = price / rublesForOneBonusMile;
        return miles;
    }
}

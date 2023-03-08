public class BonusMilesService {
    int rublesforonebonusmile = 20;
     public int calculate(int price) {
        int miles = price / rublesforonebonusmile;
        return miles;
    }
}

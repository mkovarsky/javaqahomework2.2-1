public class BonusMilesService {
    public int calculate(int price) {
        int miles = (int) (price * 0.05 / 100);
        return miles;
    }
}

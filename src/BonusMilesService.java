public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = cost / 20;

        if (bonus > 20) {
            cost = bonus;
        } else {
            cost = 0;
        }
        return bonus;
    }
}

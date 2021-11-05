package Week8.yl10;

public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return this.daysLeft;
    }

    public void work() {
        this.daysLeft--;

        if (this.daysLeft < 0) {
            this.daysLeft = 0;
        }
    }
}

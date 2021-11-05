package Week8.yl10;

public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
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

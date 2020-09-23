package tindall;

public class Cruise implements Expense {
    private Destination d;

    public Cruise(Destination d) {
        setD(d);
    }

    public void setD(Destination d) {
        this.d = d;
    }

    public Destination getD() {
        return this.d;
    }

    @Override
    public float getCost() {
        if (getD() == Destination.Mexico) {
            return 1000;
        } else if (getD() == Destination.Europe) {
            return 2000;
        } else {
            return 3000;
        }
    }
}

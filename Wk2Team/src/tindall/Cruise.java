package tindall;

public class Cruise implements Expense {
    private Destination _d;

    public Cruise(Destination d) {
        _d = d;
    }

    public float getCost() {
        if (_d == Destination.Mexico) {
            return 1000;
        } else if (_d == Destination.Europe) {
            return 2000;
        } else if (_d == Destination.Japan){
            return 3000;
        } else {
                return 0;
        }
    }
}

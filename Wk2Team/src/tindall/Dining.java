package tindall;

import static tindall.Destination.*;

public class Dining implements Expense{
    Destination _d;
    int _nights;

    public Dining(Destination d, int nights) {
        _d = d;
        _nights = nights;
    }

    public float getCost() {
        float perday = switch (_d) {
            case Mexico -> 10;
            case Europe -> 20;
            case Japan -> 30;
        };
        return perday * _nights;
    }
}

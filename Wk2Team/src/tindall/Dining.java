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
        float perday = 0;
        switch(_d) {
            case Mexico:
                perday =10;
                break;
            case Europe:
                perday=20;
                break;
            case Japan:
                perday = 30;
                break;
            default:
                perday = 0;
                break;
        }
        return perday * _nights;
    }
}

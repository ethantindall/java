package tindall;

public class Lodging implements Expense{
    Destination _d;
    int _nights;

    public Lodging(Destination d, int nights) {
        _d = d;
        _nights = nights;
    }

    public float getCost() {
        float perday = 0;
        switch(_d) {
            case Mexico:
                perday =100;
                break;
            case Europe:
                perday= (float) (200 + 200*.1);
                break;
            case Japan:
                perday = (float) (300+ (300*.3));
                break;
            default:
                perday = 0;
                break;
        }
        return perday * _nights;
    }
}

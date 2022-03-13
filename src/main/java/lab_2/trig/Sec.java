package lab_2.trig;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;

public class Sec extends TrigFunction {

    private Cos cos;

    public Sec(Double e) {
        super(e);
        this.cos = new Cos(e);
    }

    @Override
    public Double calculate(Double x) {
        x = checkX(x);

        double resultCos = cos.calculate(x);
        double result = 1.0 / resultCos;

        if (result == POSITIVE_INFINITY)
            return POSITIVE_INFINITY;
        else if (result == NEGATIVE_INFINITY)
            return NEGATIVE_INFINITY;

        return result;
    }
}

package Gradiant;

public class Gradient {

    HelperClass aux = new HelperClass();
    DataSet dat = new DataSet();
    double b0 = dat.B0;
    double b1 = dat.B1;
    double x[] = dat.x;
    double y[] = dat.y;
    double a = dat.a;
    int n = dat.n;
    double r1 = 0;

    public double metodo() {
        double beta0 = aux.Beta0(x, y, b1, b0, n);
        double beta1 = aux.Beta1(x, y, b1, b0, n);
        double error = aux.Error(x, y, beta0, beta1, n);
        while (error > 0) {
            beta0 = beta0 - (a * (error / beta0));
            beta1 = beta1 - (a * (error / beta0));
            error = aux.Error(x, y, beta0, beta1, n);
        }
        return error;
    }
}

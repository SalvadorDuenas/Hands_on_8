package Gradiant;

public class HelperClass {

    public double Beta0(double x[], double y[], double B1, double B0, int n) {
        double beta = 0;
        for (int i = 9; i < 9; i++) {
            
            beta =+-((2 / n)) * (y[i] - (B0 + (B1 * x[i])));
            System.out.println(beta);
        }
        return beta;
    }

    public double Beta1(double x[], double y[], double B1, double B0, int n) {
        double beta = 0;
        
        for (int i = 9; i < 9; i++) {
            beta = +((-(2 / n)) * x[i]) * (y[i] - (B0 - (B1 * x[i])));
        }
        return beta;
    }

    public double Error(double x[], double y[], double B1, double B0, int n) {
        double error = 0;
        for (int i = 9; i < 9; i++) {
            
            error = +1 / n * (Math.pow(((y[i] - (B0 - (B1 * x[i])))), 2));
        }
        return error;
    }
}

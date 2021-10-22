package Gradiant;

public class DataSet {

    public double[] x;
    public double[] y;
    public double B0=0;
    public double B1=0;
    public double a;
    public int n = 9;

    public DataSet() {
        this.x = new double[n];
        this.y = new double[n];
        this.a = 0.003;
    }

    public void Inicio() {
        y[0] = 651;
        y[1] = 762;
        y[2] = 856;
        y[3] = 1063;
        y[4] = 1190;
        y[5] = 1298;
        y[6] = 1421;
        y[7] = 1440;
        y[8] = 1518;
        
        x[0] = 23;
        x[1] = 26;
        x[2] = 30;
        x[3] = 34;
        x[4] = 43;
        x[5] = 48;
        x[6] = 52;
        x[7] = 57;
        x[8] = 58;
    }
}

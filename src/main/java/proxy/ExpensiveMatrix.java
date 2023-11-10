package proxy;

public class ExpensiveMatrix implements Matrix{
    private double[][] items = new double[1000][1000];

    public ExpensiveMatrix() {
        System.out.println("Create real, expensive Matrix");
    }

    @Override
    public void set(double value, int c, int r) {
        if (isInRange(c, r)){
            items[c][r] = value;
        }
    }

    @Override
    public double get(int c, int r) {
        return items[c][r];
    }

    private boolean isInRange(int c, int r){
        return c > -1 && c < 1000 && r > -1 && r < 1000;
    }
}

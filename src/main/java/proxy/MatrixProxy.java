package proxy;

public class MatrixProxy implements Matrix{
    private Matrix matrix;
    private double a00;
    private double a01;
    private double a10;
    private double a11;
    @Override
    public void set(double value, int c, int r) {
        if (isInRange(c, r)){
            if(c == 0 && r == 0){
                a00 = value;
            }
            if(c == 1 && r == 0){
                a10 = value;
            }
            if(c == 0 && r == 1){
                a01 = value;
            }
            if(c == 1 && r == 1){
                a11 = value;
            }
        } else {
            createExpensiveMatrix();
            copy();
            matrix.set(value, c, r);
        }
    }

    private void copy(){
        matrix.set(a00, 0, 0);
        matrix.set(a01, 0, 1);
        matrix.set(a10, 1, 0);
        matrix.set(a11, 1, 1);
    }

    private void createExpensiveMatrix() {
        if (matrix == null) {
            matrix = new ExpensiveMatrix();
        }
    }

    @Override
    public double get(int c, int r) {
        if (isInRange(c, r)){
            if(c == 0 && r == 0){
                return a00;
            }
            if(c == 1 && r == 0){
                return a10;
            }
            if(c == 0 && r == 1){
                return a01;
            }
            if(c == 1 && r == 1){
                return a11;
            }
            return Double.NaN;
        } else {
            createExpensiveMatrix();
            return matrix.get(c, r);
        }
    }
    
    private boolean isInRange(int c, int r){
        return (c == 0 || c == 1) && (r == 0 || r == 1);
    }
}

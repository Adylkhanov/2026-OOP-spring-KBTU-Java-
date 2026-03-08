package labs.lab1.Problem1;

public class Data {

    private double sum;
    private double max;
    private int count;

    public Data() {
        this.sum = 0.0;
        this.max = Double.NEGATIVE_INFINITY; 
        this.count = 0;
    }

    public void addValue(double value) {
        sum += value;
        count++;

        if (value > max) {
            max = value;
        }
    }
    

    public double getAverage(){
        if (count == 0) {
           return 0.0;
        }
        return sum/count;
    }

    public double getMaximum() {
        if (count == 0) {
            return 0.0; 
        }
        return max;
    }

    public int getCount() {
        return count;
    }
}

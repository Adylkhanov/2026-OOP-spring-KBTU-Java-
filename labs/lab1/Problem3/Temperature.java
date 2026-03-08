package labs.lab1.Problem3;

public class Temperature {

    private double temperature;
    private char scale;

    private static char normalizeScale(char s) {
        s = Character.toUpperCase(s);
        if (s != 'C' && s != 'F') {
            throw new IllegalArgumentException("Scale must be 'C' or 'F'. Got: " + s);
        }
        return s;
    }


    public Temperature() {
        this.temperature = 0;
        this.scale = 'C';
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.temperature = 0;
        this.scale = normalizeScale(scale);
    }

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = normalizeScale(scale);
    }

    public double getCelcium(){
        if(normalizeScale(scale) == 'F'){
            return 5 * ((temperature - 32)/9);
        }
        return temperature;
    }

    public double getFahrenheit() {
        if (normalizeScale(scale) == 'C') {
            return 9 * temperature / 5 + 32;
        }
        return temperature;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public void setScale(char scale) {
        this.scale = normalizeScale(scale);
    }

    public void setTemperature(double temp, char scale) {
        this.temperature = temp;
        this.scale = normalizeScale(scale);
    }

    public char getScale() {
        return scale;
    }


    
}

package labs.lab1.Problem3;


class Main {

    public static void main (String[] args) {

        
        Temperature t1 = new Temperature();
        System.out.println("t1 Celsius: " + t1.getCelsius());
        System.out.println("t1 Fahrenheit: " + t1.getFahrenheit());
        System.out.println("t1 Fahrenheit: " + t1.getScale());
        System.out.println("t1 Fahrenheit: " + t1.getClass());

        t1.setScale('F');
        System.out.println("t1 Celsius: " + t1.getCelsius());
        System.out.println("t1 Fahrenheit: " + t1.getFahrenheit());

        t1.setTemperature(34, 'C');
         System.out.println("t1 Celsius: " + t1.getCelsius());
        System.out.println("t1 Fahrenheit: " + t1.getFahrenheit());

    }
}

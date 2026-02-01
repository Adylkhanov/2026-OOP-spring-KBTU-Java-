package Practice2;

public class Task2 {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5);

        System.out.println(triangle.toString());
    }

}

class Triangle {

    private final int length;

    private final static String symbol = "[*]";

    public Triangle(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        this.length = length;

    }



    @Override
    public String toString() {

        String result = "";

        for (int i = 1; i <= length; i++) {

            for (int j = 1; j <= i; j++) {

                result += symbol;

            }
            result += "\n";
        }


        return result;



    }

}

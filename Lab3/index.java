
import java.util.function.Function;

class index {

    public static void main(String[] args) {

        if (args.length > 1) {
            double degree = Double.parseDouble(args[0]);

            Function<Double, Double> toFahrenheit = new Function<Double, Double>() {
                @Override
                public Double apply(Double deg) {
                    return (deg * 9.0 / 5) + 32;
                }
            };

            Function<Double, Double> toCelsius = new Function<Double, Double>() {
                @Override
                public Double apply(Double deg) {
                    return (deg - 32) * 5.0 / 9;
                }
            };

            if (args[1].toLowerCase().equals("f")) {
                System.out.println("The Celsius degree is: " + toCelsius.apply(degree));
            } else if (args[1].toLowerCase().equals("c")) {
                System.out.println("The Fahrenheit degree is: " + toFahrenheit.apply(degree));
            } else {
                System.out.println("Enter a valid choice ('c' for Celsius or 'f' for Fahrenheit).");
            }
        } else {
            System.out.println("You must enter a degree and the type of conversion f or c");
        }
    }
}

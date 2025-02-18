
import java.util.function.Function;

class index2 {

    public static void main(String[] args) {
        Function<coefficient, roots> solve = new Function<coefficient, roots>() {
            @Override
            public roots apply(coefficient coeff) {
                double a = coeff.a;
                double b = coeff.b;
                double c = coeff.c;

                double discriminant = b * b - 4 * a * c;

                if (a != 0) {

                    if (discriminant < 0) {
                        System.out.println("The equation has no real roots.");
                        return null;
                    }

                    double sqrtDiscriminant = Math.sqrt(discriminant);
                    double root1 = (-b + sqrtDiscriminant) / (2 * a);
                    double root2 = (-b - sqrtDiscriminant) / (2 * a);
                    return new roots(root1, root2);

                } else {
                    System.out.println("Can't divide by zero.");
                    return null; 
                }
            }
        };

        coefficient coeff = new coefficient(1, -3, 2);

        roots result = solve.apply(coeff);

        if (result != null) {
            System.out.println("Root 1: " + result.root1);
            System.out.println("Root 2: " + result.root2);
        }
    }

}

class coefficient {

    double a, b, c;

    public coefficient(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class roots {

    double root1, root2;

    public roots(double x1, double x2) {
        this.root1 = x1;
        this.root2 = x2;
    }
}

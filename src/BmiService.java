public class BmiService {
    public int calculate(double heightM, double weightKg) {
        double bmi = weightKg / (heightM * heightM);
        return (int) bmi;
    }
}

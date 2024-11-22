public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 65;
        double heightM = 1.66;
        int bmi = service.calculate (weightKg, heightM);
        System.out.println(bmi);
    }
}
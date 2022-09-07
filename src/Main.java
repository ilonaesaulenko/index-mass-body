public class Main {

    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        float IBM = calculate.calculate(1.65F,57.3F);
        System.out.println(IBM + "индекс массы тела");
    }
}

public class BmiService {
//а=рост, м; b=вес, кг
    public float calculate(float a, float b) {

        float IBM = b/(a*a);
        return IBM;

    }
}

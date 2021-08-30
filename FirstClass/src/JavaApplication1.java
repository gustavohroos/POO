import java.lang.Math;
public class JavaApplication1 {
    public static void main(String[] args) throws Exception {
        System.out.printf("Raiz de 49: %.2f\n", Math.sqrt(49.0));
        System.out.printf("Potência 2^3: %.2f\n", Math.pow(2,3));

        double[] medidasDeTemperatura;
        medidasDeTemperatura = new double[24*60*60];
        medidasDeTemperatura[1] = 2.1;
        double[] duplicata = medidasDeTemperatura;
        duplicata[1] = 55.7;
        System.out.printf("%f\n", duplicata[1]);
        System.out.printf("%f\n", medidasDeTemperatura[1]);
    }
}
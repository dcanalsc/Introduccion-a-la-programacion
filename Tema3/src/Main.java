public class Main {

    public static void main(String[] args) {

        System.out.println("RESULTADO PRIMERA PARTE:");

        int resultado;
        resultado = suma3(3, 4, 5);

        System.out.println(resultado);

        System.out.println("RESULTADO SEGUNDA PARTE:");

        Coche miCoche = new Coche();
        miCoche.maspuertas();
        System.out.println(miCoche.puertas);

    }
    public static int suma3(int a, int b, int c) {
        return a + b + c;
    }

}
class Coche {
    public int puertas = 3;

    public void maspuertas() {
        this.puertas++;
    }
}

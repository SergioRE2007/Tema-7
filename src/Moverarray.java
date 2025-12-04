public class Moverarray {
    public static void main(String[] args) {
        int[] numeros = delxalb(1, 10);
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i >= 1; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static int[] delxalb(int a, int b) {
        int[] papu = new int[b - a + 1];
        for (int i = 0; i < papu.length; i++) {
            papu[i] = a;
            a++;
        }
        return papu;
    }
}

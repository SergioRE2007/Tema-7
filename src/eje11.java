public class eje11 {
    public static void main(String[] args) {
        int[] numero = aleatorio(20, 100, 0);
        System.out.println();
        muestraarray(numero);
        System.out.println();
        int[] odenado = ordenaarrayprimos(numero);
        muestraarray(odenado);
    }
    public static int[] aleatorio(int tamaño, int max, int min) {
        int[] aleatorio = new int[tamaño];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * ((max - min + 1)));
        }
        return aleatorio;
    }
    public static int[] ordenaarrayprimos(int array[]) {
        int[] odenado = new int[array.length];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            if (esPrimoIndividual(array[i]) == true) {
                odenado[aux] = array[i];
                aux++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (esPrimoIndividual(array[i]) == false) {
                odenado[aux] = array[i];
                aux++;
            }
        }
        return odenado;
    }
    public static void muestraarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static boolean esPrimoIndividual(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}

public class eje10 {
    public static void main(String[] args) {
        int[] numero = aleatorio(20, 100, 0);
        System.out.println();
        muestraarray(numero);
        System.out.println();
        int[] odenado = ordenaarraypares(numero);
        muestraarray(odenado);
    }
    public static int[] aleatorio(int tamaño, int max, int min) {
        int[] aleatorio = new int[tamaño];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * ((max - min + 1)));
        }
        return aleatorio;
    }
    public static int[] ordenaarraypares(int array[]) {
        int[] odenado = new int[array.length];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                odenado[aux] = array[i];
                aux++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odenado[aux] = array[i];
                aux++;
            }
        }
        return odenado;
    }
    public static void muestraarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}

public class eje13 {
    public static void main(String[] args) {
        int[] numero = aleatorio(100, 500, 0);
        muestraarray(numero);
        System.out.println();
        System.out.println();
        muestraarrayconmaxymin(numero);
    }

    public static int obtenerNumeroMinimo(int[] array) {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static int obtenerNumeroMaximo(int[] array) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public static int[] aleatorio(int tamaño, int max, int min) {
        int[] aleatorio = new int[tamaño];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * ((max - min + 1)));
        }
        return aleatorio;
    }

    public static void muestraarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void muestraarrayconmaxymin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == obtenerNumeroMaximo(array)) {
                System.out.print("**" + array[i] + "** ");
            } else if (array[i] == obtenerNumeroMinimo(array)) {
                System.out.print("**" + array[i] + "** ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

}

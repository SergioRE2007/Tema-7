public class eje16 {
    public static void main(String[] args) {
        int[] num = aleatorio(10, 400, 0);
        muestraarray(num);
        System.out.println();
        System.out.println("¿Que nuemero quieres que este a la izquierda?");
        int NumeroIzquierda = Integer.parseInt(System.console().readLine());
        if (obtenerPosicionNumero(num, NumeroIzquierda) == -1) {
            System.out.println("Ese numero no se encuentra en el array");
        } else {
            num = muevearrayprimeraposicion(num, NumeroIzquierda);
            muestraarray(num);
        }
    }

    public static int[] aleatorio(int tamaño, int max, int min) {
        int[] aleatorio = new int[tamaño];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * ((max - min + 1)));
        }
        return aleatorio;
    }

    public static int obtenerPosicionNumero(int[] array, int numero) {
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                posicion = i;
            }
        }
        return posicion;
    }

    public static void muestraarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
// De derecha a izquierda

    public static int[] muevearrayprimeraposicion(int array[], int numero) {
        while (array[0] != numero) {
            int ultimo = array[array.length - 1];
            for (int i = array.length - 1; i >= 1; i--) {
                array[i] = array[i - 1];
            }
            array[0] = ultimo;
        }
        return array;
    }
// De izquierda a derecha
    public static int[] muevearrayprimeraposicionver2(int array[], int numero) {
        while (array[0] != numero) {
            int primero = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = primero;
        }
        return array;
    }

}

public class eje12 {
    public static void main(String[] args) {
        int[] numeros = aleatorio(10, 100, 0);
        muestraarray(numeros);
        System.out.println();
        numeros = cambiaarray(numeros, 2, 9);
        System.out.println();
        muestraarray(numeros);

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

    public static int[] cambiaarray(int[] array, int primeraposicion, int segundaposicion) {
        int auxprimera = array[primeraposicion];
        int auxsegunda = array[segundaposicion];

        // Desplazar elementos hacia la izquierda desde primera hacia segunda
        for (int i = primeraposicion; i < segundaposicion; i++) {
            array[i] = array[i + 1]; // Cada posición toma el valor de la siguiente
        }

        array[segundaposicion] = auxprimera; // La segunda posición recibe el valor original de la primera
        return array;
    }

}

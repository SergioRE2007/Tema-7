public class Aleatorios {
    public static void main(String[] args) throws Exception {

        int numeros[] = aleatorios(10, 1, 7);
        //int posicionmax = obtenerPosicionMaximo(numeros);
        int numerosMax = obtenerNumemroMaximo(numeros);
        int numerosMin = obtenerNumeroMinimo(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numerosMax) {
            System.out.println(numeros[i]+" Maximo");
            } else if (numeros[i] == numerosMin){
                System.out.println(numeros[i]+" Minimo");
            } else {
                System.out.println(numeros[i]);
            }
            
        }
    }

    public static int[] aleatorios(int tamaño, int min, int max) {
        int[] numeros = new int[tamaño];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return numeros;
    }

    public static int obtenerPosicionMaximo(int[] array) {
        int maximo = Integer.MIN_VALUE;
        int posicion = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maximo) {
                maximo = array[i];
                posicion = i;
            }
        }
        return posicion;
    }

    public static int obtenerPosicionMinimo(int[] array) {
        int minimo = Integer.MAX_VALUE;
        int posicion = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<minimo) {
                minimo = array[i];
                posicion = i;
            }
        }
        return posicion;
    }
    public static int obtenerNumeroMinimo(int[] array) {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public static int obtenerNumemroMaximo(int[] array) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }
}

public class eje15 {
    public static void main(String[] args) {
        int[] mesas = aleatorio(10, 4, 0);
        muestraarray(mesas);
        while (true) {
            System.out.println();
            System.out.println("¿Cuantas personas sois?");
            int NuevosComensales = Integer.parseInt(System.console().readLine());
            int posicionminimo = obtenerPosicionMinimo(mesas);
            if (NuevosComensales > 4) {
                System.out.println("lo sentimos no hay mesas de mas de 4");
            } else if (NuevosComensales + mesas[posicionminimo] > 4) {
                System.out.println("lo sentimos no hay hueco por favor espere un poco");
            } else {
                mesas[posicionminimo] = NuevosComensales + mesas[posicionminimo];
            }
            System.out.println();
            muestraarray(mesas);
        }
    }

    public static int[] aleatorio(int tamaño, int max, int min) {
        int[] aleatorio = new int[tamaño];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * ((max - min + 1)));
        }
        return aleatorio;
    }

public static void muestraarray(int[] array) {
    char V = '│'; 
    for (int i = -1; i < array.length; i++) {
        System.out.print("──────");
    }
    System.out.println();

    for (int i = -1; i < array.length; i++) {
        if (i == -1) {
            System.out.print(V+"NºMesa " + V);
        } else {
            System.out.print("  " + i + "  " + V);
        }
    }
    System.out.println();
    for (int i = -1; i < array.length; i++) {
        System.out.print("──────");
    }
    System.out.println();
    for (int i = -1; i < array.length; i++) {
        if (i == -1) {
            System.out.print(V+"Ocupa  " + V);
        } else {
            System.out.print("  " + array[i] + "  " + V);
        }
    }
    System.out.println();
    for (int i = -1; i < array.length; i++) {
        System.out.print("──────");
    }
    System.out.println();
}
    public static int obtenerPosicionMaximo(int[] array) {
        int maximo = Integer.MIN_VALUE;
        int posicion = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
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
            if (array[i] < minimo) {
                minimo = array[i];
                posicion = i;
            }
        }
        return posicion;
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
}
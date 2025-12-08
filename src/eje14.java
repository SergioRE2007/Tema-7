public class eje14 {
    public static void main(String[] args) {
        String[] random = { "bici", "blanco", "reloj", "rojo", "árbol", "gato", "negro", "pelota", "libro", "pan", "azul", "silla", "casa" };
        muestraarray(random);
        System.out.println();
        System.out.println();
        String[] randomordenado = ordenacolores(random);
        muestraarray(randomordenado);
    }

    public static void muestraarray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean tienecolor(String array) {
        boolean tienecolor = false;
        String[] colores = { "blanco", "negro", "rojo", "azul" };
        for (int i = 0; i < colores.length && !tienecolor; i++) {
            tienecolor = (array == colores[i]) ? true : false;
        }
        return tienecolor;
    }

    public static String[] ordenacolores(String[] array) {
        String[] ordenado = new String[array.length];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            if (tienecolor(array[i])) {
                ordenado[aux] = array[i];
                aux++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (!tienecolor(array[i])) {
                ordenado[aux] = array[i];
                aux++;
            }
        }
        return ordenado;
    }

}

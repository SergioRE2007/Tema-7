public class eje09 {
    public static void main(String[] args) {
        int[] numeros = aleatorio(10, 9, 0);
        muestraarray(numeros);
    }
    public static void muestraarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
                System.out.println((array[i]%2 == 0)? array[i] + " Par": array[i] + " Impar");
        }
    }
    public static int[] aleatorio(int tamaño, int max, int min) {
        int[] aleatorio = new int[tamaño];
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * ((max - min + 1)));
        }
        return aleatorio;
    }
}

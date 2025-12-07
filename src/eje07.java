public class eje07 {
    public static void main(String[] args) {
        int[] numeros = aleatorio(100, 20, 0);
        muestraarray(numeros);
        System.out.println();
        System.out.println("Dime el numero que quieres cambiar");
        int ncambio = Integer.parseInt(System.console().readLine());
        System.out.println("Dime el numero que quieres poner");
        int nponer = Integer.parseInt(System.console().readLine());
        cambiararrray(numeros, ncambio, nponer);
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
    public static void cambiararrray(int[] array, int ncambio, int nponer) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ncambio) {
                System.out.print("*" + nponer + "* ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}

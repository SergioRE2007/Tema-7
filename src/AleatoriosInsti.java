public class AleatoriosInsti {
    public static void main(String[] args) throws Exception {
        int[] num = aleatorio(3, 8, 7);
        int[] porcentajes = new int[2];
        for (int i = 0; i < num.length; i++) {
            porcentajes[num[i]]++;
        }
        System.out.println();
        for (int i = 0; i < porcentajes.length; i++) {
            System.out.println(i+1+" = "+porcentajes[i]);

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

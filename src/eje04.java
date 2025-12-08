public class eje04 {
    public static void main(String[] args) {
        int[] num = aleatorio(12, 100, 0);
        int[] num2 = new int[num.length];
        int[] num3 = new int[num.length];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = num[i]*num[i];
        }
        for (int i = 0; i < num2.length; i++) {
            num3[i] = num[i]*num[i]*num[i];
        }
        for (int i = 0; i < num.length; i++) {
            if (i == 0) { 
                System.out.println("  n1  |  n2   |    n3   ");
                System.out.println("______|_______|__________");
            }
            System.out.printf("%4d  | %5d |  %6d%n",num[i],num2[i],num3[i]);
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

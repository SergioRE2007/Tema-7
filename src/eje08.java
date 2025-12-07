public class eje08 {
    public static int MINIMA_TEMPERATURA = -10;
    public static int MAXIMA_TEMPERATURA = 60;
    public static int ANCHO_TERMINAL = 30;
    public static String mesTexto(int mes){
        return switch(mes){
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Mes no válido";
        };
    }

    public static String barrasTemperatura(int temperatura){
        String asteriscos = "";
        for(int i = 0; i < temperatura * ANCHO_TERMINAL / MAXIMA_TEMPERATURA; i++){
            asteriscos +="*";
        }
        return asteriscos;
    }
    public static void main(String[] args) {
        final int MESES = 12;
        int[] temperaturas = new int[MESES];
        for(int i = 0; i < MESES; i++){
            temperaturas[i] = (int)(Math.random()*(MAXIMA_TEMPERATURA - MINIMA_TEMPERATURA + 1)) + MINIMA_TEMPERATURA;
        }
        for(int i=0; i < MESES; i++)
            System.out.println(mesTexto(i+1)+" | "+barrasTemperatura(temperaturas[i])+ " " + temperaturas[i]+"ºC");
    }
}
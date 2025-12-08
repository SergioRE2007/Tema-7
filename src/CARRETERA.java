public class CARRETERA {
    public static void obstaculo(){
        int obstucalo = (int)(Math.random()*2+1);
        int tipoObstucalo = (int)(Math.random() * 2 + 1);
        int posicionObstucalo = (int)(Math.random()*4 + 1);
        if (obstucalo == 1) {
            System.out.println("|    |");
        } else {
            String carril = "";
            for (int i = 1; i < posicionObstucalo; i++) {
                carril += " ";
            }
            carril += (tipoObstucalo == 1)?"*":"0";
            for (int i = 0; i < 4-posicionObstucalo; i++) {
                carril += " ";
            }
            System.out.println("|"+carril+"|");
        }
    }
    public static void main (String[] args) {
        try {
        int posicionrandom = 0;
        int aux = 0;
        while ( true ){
            posicionrandom = (int)(Math.random()*3)-1;
            for (int j = 0; j < 50+posicionrandom+aux; j++) {
                System.out.print(" ");
            }
            aux = posicionrandom+aux;
            if (aux < -30) {
                aux++;
            }
            obstaculo();
            Thread.sleep(20);
        }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}

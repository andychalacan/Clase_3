public class llamada {
    public static void main(String[] args) {
        Jugador avatar1 =new Jugador();
        Jugador avatar2=new Jugador("Pedro",21,"Argentina");
System.out.println("Informacion del jugador 1");
        avatar1.patear();
        avatar1.correr();
System.out.println("Informacion del jugador 2");
        avatar2.patear();
        avatar2.correr();
        avatar2.Saltar(2);
    }
}

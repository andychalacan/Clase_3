public class Jugador {
    String Nombre;
    int edad;
    String pais;
    int saltos=2;


    public Jugador(){
        //DATOS QUEMADOS
        Nombre="Andy";
        edad=23;
        pais="Ecuador";
    }
    public Jugador(    String Nombre,int edad,String pais){
        this.Nombre=Nombre;
        this.edad=edad;
        this.pais=pais;
    }
    public void patear(){
        System.out.println("El avatar se llama; "+Nombre+" Con edad de: "+edad+" Viene de: "+pais);
    }
    public void correr() {
        System.out.println("El avatar se llama; " + Nombre + " Con edad de: " + edad + " Viene de: " + pais);
    }
    public void Saltar(int saltos) {
        saltos+=saltos;
        System.out.println("El avatar se llama; " + Nombre + " Con edad de: " + edad + " Viene de: " + pais+"y ha saltado; "+saltos);
    }
}
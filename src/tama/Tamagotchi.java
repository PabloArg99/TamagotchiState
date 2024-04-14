package tama;

public class Tamagotchi {

    private String nombre;
    private Estado estado;

    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.estado = new EstadoFeliz(this);
    }

    public void changeState(Estado estado2){
        this.estado=estado2;
    }
    public void llorar(){
        System.out.println("Llora :'( ");
    }
    public void sonreir(){
        System.out.println("\\(◕‿◕)/");
    }
}

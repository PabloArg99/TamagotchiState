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
    public void darDeComer(){
        estado.darDeComer(this );
    }
    public void darDeTomar(){
        estado.darDeTomar(this );
    }
    public void hacerleMimos(){
        estado.hacerleMimos( this);
    }
    public void pegarle(){
        estado.pegarle(this );
    }


    @Override
    public String toString() {
        String estado = this.estado.toString();

        return "Nuestro amigo " + this.nombre + " actualmente esta :" + estado ;
    }
}

package tama;

public class EstadoFeliz extends Estado {

    private Tamagotchi tama;
    public EstadoFeliz(Tamagotchi tama) {
        super(tama);

    }

    @Override
    public void darDeComer() {
        System.out.println("Eructa  :O" );
    }

    @Override
    public void darDeTomar() {
        System.out.println("Sonrie");

    }

    @Override
    public void hacerleMimos() {
        System.out.println("Hace ruidos de risa");
        tama.sonreir();

    }

    @Override
    public void pegarle() {

        tama.llorar();
        tama.changeState(new EstadoTriste(tama));

    }


}

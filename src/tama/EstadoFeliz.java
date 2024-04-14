package tama;

public class EstadoFeliz extends Estado {

    private Tamagotchi tama;
    public EstadoFeliz(Tamagotchi tama) {
        super(tama);

    }

    @Override
    public void darDeComer(Tamagotchi tama) {
        System.out.println("Eructa  :O" );
    }

    @Override
    public void darDeTomar(Tamagotchi tama) {
        System.out.println("Sonrie");

    }

    @Override
    public void hacerleMimos(Tamagotchi tama) {
        System.out.println("Hace ruidos de risa");
        tama.sonreir();

    }

    @Override
    public void pegarle(Tamagotchi tama) {

        tama.llorar();
        tama.changeState(new EstadoTriste(tama));

    }


}

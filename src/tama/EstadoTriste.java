package tama;

public class EstadoTriste extends Estado{

    private Tamagotchi tama;

    public EstadoTriste(Tamagotchi tama){
        super(tama);
    }

    @Override
    public void darDeComer(Tamagotchi tama) {

    }

    @Override
    public void darDeTomar(Tamagotchi tama) {

    }

    @Override
    public void hacerleMimos(Tamagotchi tama) {
        tama.changeState(new EstadoFeliz(tama));

    }

    @Override
    public void pegarle(Tamagotchi tama) {
        tama.llorar();
        tama.changeState(new EstadoTriste(tama));

    }
}

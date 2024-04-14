package tama;

public class EstadoTriste extends Estado{

    private Tamagotchi tama;

    public EstadoTriste(Tamagotchi tama){
        super(tama);
    }

    @Override
    public void darDeComer() {

    }

    @Override
    public void darDeTomar() {

    }

    @Override
    public void hacerleMimos() {
        tama.changeState(new EstadoFeliz(tama));

    }

    @Override
    public void pegarle() {
        tama.llorar();
        tama.changeState(new EstadoTriste(tama));

    }
}

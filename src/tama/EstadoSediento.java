package tama;

public class EstadoSediento extends Estado {

    private Tamagotchi tama;

    public EstadoSediento(Tamagotchi tama){super(tama);}

    @Override
    public void darDeComer() {

    }

    @Override
    public void darDeTomar() {
        tama.changeState(new EstadoFeliz(tama));

    }

    @Override
    public void hacerleMimos() {

    }

    @Override
    public void pegarle() {
        tama.llorar();

    }
}

package tama;

public class EstadoHambriento extends Estado{

    private Tamagotchi tama;

    public EstadoHambriento(Tamagotchi tama){super(tama);}

    @Override
    public void darDeComer() {
        tama.changeState(new EstadoFeliz(tama));

    }

    @Override
    public void darDeTomar() {

    }

    @Override
    public void hacerleMimos() {

    }

    @Override
    public void pegarle() {
        tama.llorar();

    }


}

package tama;

public class EstadoSediento extends Estado {

    private Tamagotchi tama;

    public EstadoSediento(Tamagotchi tama){super(tama);}

    @Override
    public void darDeComer(Tamagotchi tama) {

    }

    @Override
    public void darDeTomar(Tamagotchi tama) {
        tama.changeState(new EstadoFeliz(tama));

    }

    @Override
    public void hacerleMimos(Tamagotchi tama) {

    }

    @Override
    public void pegarle(Tamagotchi tama) {
        tama.llorar();

    }
}

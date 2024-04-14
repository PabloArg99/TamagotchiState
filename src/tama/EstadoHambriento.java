package tama;

public class EstadoHambriento extends Estado{

    private Tamagotchi tama;

    public EstadoHambriento(Tamagotchi tama){super(tama);}

    @Override
    public void darDeComer(Tamagotchi tama) {
        tama.changeState(new EstadoFeliz(tama));

    }

    @Override
    public void darDeTomar(Tamagotchi tama) {

    }

    @Override
    public void hacerleMimos(Tamagotchi tama) {

    }

    @Override
    public void pegarle(Tamagotchi tama) {
        tama.llorar();

    }


}

package tama;

public abstract class Estado {
    Tamagotchi tama;


    public Estado(Tamagotchi tama) {
        this.tama = tama;
    }

    public abstract void darDeComer(Tamagotchi tama);
    public abstract void darDeTomar(Tamagotchi tama);
    public abstract void hacerleMimos(Tamagotchi tama);
    public abstract void pegarle(Tamagotchi tama);

}

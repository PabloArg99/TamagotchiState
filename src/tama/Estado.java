package tama;

public abstract class Estado {
    Tamagotchi tama;

    public Estado(Tamagotchi tama) {
        this.tama = tama;
    }

    public abstract void darDeComer();
    public abstract void darDeTomar();
    public abstract void hacerleMimos();
    public abstract void pegarle();

}

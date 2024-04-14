package tama;

public class Test {

    public static void main(String[] args) {

        Tamagotchi jose = new Tamagotchi("Josesito");
        jose.sonreir();
        System.out.println(jose);
        jose.pegarle();
        System.out.println(jose);
        jose.hacerleMimos();
        System.out.println(jose);
        jose.hacerleMimos();
        jose.darDeComer();
        jose.changeState(new EstadoHambriento(jose));
        System.out.println(jose);
        jose.darDeComer();
        System.out.println(jose);

    }

}


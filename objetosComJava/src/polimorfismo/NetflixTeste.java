package polimorfismo;

public class NetflixTeste {

    public static void main(String[] args) {

        Filme filme = new Filme("bob");

        filme.play("português");

        System.out.println(" ");

        Serie sr = new Serie("LA", 2, 10);
        sr.play(2, 10);

    }

}

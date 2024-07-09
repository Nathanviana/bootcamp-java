package classesObjAtriMetod;

public class CarroTestar {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.marca = "Fiat";
        c1.modelo = "Argo";
        c1.ano = 2021;
        c1.velocidade = 80;

        c1.acelerar(20);

        System.out.println("Velocidade: " + c1.velocidade + " km/h");

        c1.frear(20);

        System.out.println("Velocidade: " + c1.velocidade + " km/h");

        c1.buzinar();

    }

}

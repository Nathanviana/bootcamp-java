package empregado;

public class EmpregadoTeste {

    public static void main(String[] args) {

        Empregado eg = new Empregado("Noser", "xerosinho", 20.00);
        Empregado rp = new Empregado("Rodrigo", "Pardal", 40.00);

        System.out.println("O salario é" + eg.salarioAnual());
        System.out.println("O salario é" + rp.salarioAnual());

        eg.setSalarioMensal(eg.getSalarioMensal() * 1.1);
        rp.setSalarioMensal(rp.getSalarioMensal() * 1.1);

        System.out.println("O salario é" + eg.salarioAnual());
        System.out.println("O salario é" + rp.salarioAnual());


    }

}

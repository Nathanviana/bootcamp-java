package empregado;

public class Empregado {

    public String mainNome;
    public String sobreNome;
    public double salarioMensal;

    public Empregado(String mainNome, String sobreNome, double salarioMensal) {
        this.mainNome = mainNome;
        this.sobreNome = sobreNome;
        setSalarioMensal(salarioMensal);
    }

    public String getMainNome() {
        return mainNome;
    }

    public void setMainNome(String mainNome) {
        this.mainNome = mainNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual() {
        return salarioMensal * 12;
}


}

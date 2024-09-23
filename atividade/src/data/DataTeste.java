package data;

public class DataTeste {

    public static void main(String[] args) {

        Data dt = new Data(10, 20, 2003);

        //mostrando data original
        dt.DisplayData();

        //alterando valores
        dt.setAno(2024);
        dt.setDia(23);
        dt.setMes(12);

        //mostrando datas alteradas
        dt.DisplayData();

    }

}

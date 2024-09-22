package faturas;

public class FaturaTeste {

    public static void main(String[] args) {

        Faturas ft = new Faturas("01", "escova", 2, 5);

        System.out.println(ft.getCodigoProduto());
        System.out.println(ft.getPrecoPorItem());
        System.out.println(ft.getDescricaoProduto());
        System.out.println(ft.getQuantidadeComprada());

        System.out.println(ft.getTotalFatura());

        ft.setQuantidadeComprada(-2);
        ft.setPrecoPorItem(-30);

        System.out.println(ft.getCodigoProduto());
        System.out.println(ft.getPrecoPorItem());
        System.out.println(ft.getDescricaoProduto());
        System.out.println(ft.getQuantidadeComprada());


    }

}

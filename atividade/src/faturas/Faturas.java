package faturas;

public class Faturas {

    public String codigoProduto;
    public String descricaoProduto;
    public int quantidadeComprada;
    public double precoPorItem;

    public Faturas(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        setQuantidadeComprada(quantidadeComprada);
        setPrecoPorItem(precoPorItem);
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = Math.max(0, quantidadeComprada);
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = Math.max(0, precoPorItem);
    }

    public double getTotalFatura() {
        return quantidadeComprada * precoPorItem;
    }

}

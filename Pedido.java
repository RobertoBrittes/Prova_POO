import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Pedido {

    private Cliente cliente;
    private List<Produto> produtos;
    private LocalDateTime dataHora;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.dataHora = LocalDateTime.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void adicionarProduto(Produto produto) {
        if (this.produtos.size() > 10) {
            throw new IllegalStateException("O pedido não pode conter mais de 10 produtos");
        }
        this.produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }


}
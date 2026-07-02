public class ControladorPedido {
    private Pedido pedido;
    private PedidoView view;

    public ControladorPedido(Cliente cliente, PedidoView view) {
        this.pedido = new Pedido(cliente);
        this.view = view;
    }

    public void adicionarProduto(Produto produto) {
        try {
            pedido.adicionarProduto(produto);
        } catch (IllegalStateException e) {
            System.out.println("Erro ao adicionar produto: " + e.getMessage());
        }
    }

    public void finalizarPedido() {
        view.exibirDetalhesPedido(pedido);
    }

}

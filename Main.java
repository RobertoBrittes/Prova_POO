public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("Roberto Brittes", "45999999999", "12345678900");

            PedidoView view = new PedidoView();

            ControladorPedido controlador = new ControladorPedido(cliente, view);

            Produto p1 = new Produto("X-Frango", 22.5, TipoProduto.LANCHE);
            Produto p2 = new Produto("Coca Cola", 5, TipoProduto.BEBIDA);
            Produto p3 = new Produto("Picolé", 3, TipoProduto.SOBREMESA);

            controlador.adicionarProduto(p1);
            controlador.adicionarProduto(p2);
            controlador.adicionarProduto(p3);

            controlador.finalizarPedido();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

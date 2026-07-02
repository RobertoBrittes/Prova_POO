public class PedidoView {
    public void exibirDetalhesPedido(Pedido pedido){
        System.out.println("=========== DETALHES DO PEDIDO ===========");

        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("CPF: " + pedido.getCliente().getCpf());
        System.out.println("Telefone: " + pedido.getCliente().getTelefone());
        System.out.println("------------------------------------------");

        System.out.println("Produtos:");
        for (Produto p : pedido.getProdutos()) {
            System.out.printf("%s (%s) - R$ %.2f%n", p.getNome(), p.getTipo(), p.getPreco());
        }

    }
}

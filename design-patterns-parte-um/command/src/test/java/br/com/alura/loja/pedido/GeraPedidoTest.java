package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedidoTest {

    @Test
    public void deve_gerar_um_pedido() {
        Orcamento orcamento = new Orcamento(new BigDecimal("1000.00"), 5);
        String cliente = "Fulano da Silva";
        LocalDateTime data = LocalDateTime.now();

        GeraPedido geraPedido = new GeraPedido(cliente, orcamento.getValor(), orcamento.getQuantidadeItens());

        geraPedido.executa();
    }
}

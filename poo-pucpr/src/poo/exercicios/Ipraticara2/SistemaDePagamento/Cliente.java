package poo.exercicios.Ipraticara2.SistemaDePagamento;

public class Cliente {
    public void pagar(double valor, FormaPagamento formaPagamento) {
        formaPagamento.processarPagamento();
    }
}

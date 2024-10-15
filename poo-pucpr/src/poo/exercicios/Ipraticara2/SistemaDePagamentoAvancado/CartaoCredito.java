package poo.exercicios.Ipraticara2.SistemaDePagamentoAvancado;

public class CartaoCredito implements Pagavel {
    public void realizarPagamento() {
        System.out.println("Realizando pagamento...");
    }

    public void cancelarPagamento() {
        System.out.println("Cancelando pagamento...");
    }
}

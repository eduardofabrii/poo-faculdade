package poo.exercicios.Ipraticara2.SistemaDePagamento;

public abstract class FormaPagamento implements Pagavel {
    @Override
    public void realizarPagamento() {
        System.out.println("Realizando o pagamento...");
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando o pagamento...");
    }

    public abstract void processarPagamento();
}

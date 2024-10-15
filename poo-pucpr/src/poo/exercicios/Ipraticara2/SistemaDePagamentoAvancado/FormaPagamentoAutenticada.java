package poo.exercicios.Ipraticara2.SistemaDePagamentoAvancado;

public abstract class FormaPagamentoAutenticada implements Pagavel, Autenticavel {

    public void autenticar() {
        System.out.println("Autenticando FormaPagamentoAutenticada");
    }

    public void realizarPagamento() {
        System.out.println("Realizando pagamento FormaPagamentoAutenticada");
    }

    public void cancelarPagamento() {
        System.out.println("Cancelando pagamento FormaPagamentoAutenticada");
    }

    public abstract void processarPagamento();
}

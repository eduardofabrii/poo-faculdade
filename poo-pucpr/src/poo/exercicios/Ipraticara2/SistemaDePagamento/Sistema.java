package poo.exercicios.Ipraticara2.SistemaDePagamento;

public class Sistema {
    public static void main(String[] args) {
        FormaPagamento visa = new CartaoCredito();
        Cliente cliente1 = new Cliente();

        cliente1.pagar(92.34, visa);
    }
}

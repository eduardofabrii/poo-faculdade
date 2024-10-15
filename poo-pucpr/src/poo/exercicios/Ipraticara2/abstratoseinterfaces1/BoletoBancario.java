package poo.exercicios.Ipraticara2.abstratoseinterfaces1;

public class BoletoBancario extends FormaPagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento do Boleto Bancário");
    }
}

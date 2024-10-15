package poo.exercicios.Ipraticara2.abstratoseinterfaces1;

public class CartaoCredito extends FormaPagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento do Cartão de Crédito");
    }
}

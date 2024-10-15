package poo.exercicios.Ipraticara2.abstratoseinterfaces1;

public class TransferenciaBancaria extends FormaPagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento do Transferencia Bancária");
    }
}

package poo.exercicios.Ipraticara2.abstratoseinterfaces1;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        ArrayList<FormaPagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito());
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new BoletoBancario());
        pagamentos.add(new TransferenciaBancaria());

        FormaPagamento visa = pagamentos.get(0);
        FormaPagamento mastercard = pagamentos.get(1);
        FormaPagamento boleto = pagamentos.get(2);
        FormaPagamento ted = pagamentos.get(3);

        visa.processarPagamento();
        mastercard.processarPagamento();
        ted.processarPagamento();
    }
}

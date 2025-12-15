public class Credito implements Pagamento {
    @Override

    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
    
    @Override
    public String getTipo(){
        return "Crédito";
    }
    
}

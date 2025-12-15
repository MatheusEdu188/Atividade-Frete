public class Pix implements Pagamento {
    @Override

    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no pix.");
    }
    
    @Override
    public String getTipo(){
        return "Pix";
    }
    
}

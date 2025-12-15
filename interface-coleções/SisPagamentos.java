import java.util.ArrayList;
import java.util.List;


public class SisPagamentos {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new Credito());
        pagamentos.add(new Pix());

        Pagamento p1 = new Credito();
        p1.pagar(150.0);
        p1.getTipo();

        
    
    }
    
}

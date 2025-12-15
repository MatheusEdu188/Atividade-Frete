package ex1;

public class Main {
    public static void main(String[] args){
        CadastroFrete l1 = new CadastroFrete();

        Frete f1 = new FreteExpresso(50, 100, 10);

        Frete f2 = new FretePadrao(10, 40);

        Frete f3 = new FreteSuperExpresso(50000, 100, 20, 800);


        l1.adicionarFrete(f3);
        l1.adicionarFrete(f1);
        l1.adicionarFrete(f2);


        System.out.println(l1.calcularFreteTotal());


        

    }
    
}


// polimorfismo ocorre no metodo calcularFrete, pq ele é chamado por classes diferentes, mas tem comportamentos diferentes de cada uma delas. Pois cada classe o implementa de forma diferente. como tambem pode ser o <fretavel>, pq ela é uma lista do tipo fretavel, mas armazena objetos de classes diferentes. 



package ex1;

public class FretePadrao extends Frete{

    public FretePadrao(double distanciaKM, double valorKM){
        super(distanciaKM, valorKM);
    }

    public double calcularFrete(){
        return getDistanciaKM() * getValorKM();
    }

}
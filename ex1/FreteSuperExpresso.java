package ex1;


public class FreteSuperExpresso extends Frete{
    private int nivelUrgencia;
    private double valorSeguro;


    public FreteSuperExpresso(double distanciaKM ,double valorKM, int nivelUrgencia, double valorSeguro){
        super(distanciaKM, valorKM);

        this.nivelUrgencia = nivelUrgencia;
        this.valorSeguro = valorSeguro;
    }


    public double calcularFrete(){
        return (getDistanciaKM() * getValorKM()) + (nivelUrgencia * 100) + valorSeguro;
    }
}
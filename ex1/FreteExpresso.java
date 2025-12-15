package ex1;


public class FreteExpresso extends Frete{
    private int nivelUrgencia;
    public FreteExpresso(double distanciaKM, double valorKM, int nivelUrgencia){
        super(distanciaKM, valorKM);   
        this.nivelUrgencia = nivelUrgencia;
    }

    public double calcularFrete(){
        return (getDistanciaKM() * getValorKM()) + (nivelUrgencia * 10);
    }


}
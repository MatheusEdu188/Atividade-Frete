package ex1;


public abstract class Frete implements Fretavel { 
    private double distanciaKM;
    private double valorKM;


    public Frete(double distanciaKM, double valorKm){
        this.distanciaKM = distanciaKM;
        this.valorKM = valorKm;

    }

    public double getDistanciaKM(){
        return distanciaKM;
    }

    public double getValorKM(){
        return valorKM;
    }

    
    
}

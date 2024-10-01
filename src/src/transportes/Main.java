package transportes;

public class Main {
    public static void main(String[] args) {
        IMeioTransporte[] tipoTransporte = new IMeioTransporte[3];

        tipoTransporte[0] = new Carro();
        tipoTransporte[1] = new Bicicleta();
        tipoTransporte[2] = new Trem();

        for (IMeioTransporte transporte :tipoTransporte){
            transporte.acelerar();
            transporte.frear();
            System.out.println();
        }
    }
}

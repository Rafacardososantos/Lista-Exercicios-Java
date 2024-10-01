package transportes;

public class Carro implements IMeioTransporte {

    @Override
    public void acelerar(){
        System.out.println("O carro é acelerado através do acelerador");
    }

    @Override
    public void frear() {
        System.out.println("O carro é freado através do pedal de freio e/ou freio de mão");
    }
}

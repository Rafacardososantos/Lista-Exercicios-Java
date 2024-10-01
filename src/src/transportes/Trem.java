package transportes;

public class Trem implements IMeioTransporte {

    @Override
    public void acelerar(){
        System.out.println("O trem é acelerado através dos trilhos");
    }

    @Override
    public void frear(){
        System.out.println("O trem é freado através dos trilhos");
    }
}

package transportes;

public class Bicicleta implements IMeioTransporte {

    @Override
    public void acelerar() {
        System.out.println("A bicicleta é acelerada através da força de pedalagem");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta é freada pelo freios ou pelos pés");
    }
}

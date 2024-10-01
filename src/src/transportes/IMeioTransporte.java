/*5. Crie uma interface IMeioTransporte com métodos acelerar() e
frear(). Implemente essa interface em classes Carro, Bicicleta e Trem.
No método principal, crie um array de IMeioTransporte e percorra-o
chamando acelerar() e frear() para cada objeto. Utilize polimorfismo
para que cada tipo de transporte implemente acelerar() e frear() de
maneira diferente.*/

package transportes;

public interface IMeioTransporte {
    void acelerar();
    void frear();
}



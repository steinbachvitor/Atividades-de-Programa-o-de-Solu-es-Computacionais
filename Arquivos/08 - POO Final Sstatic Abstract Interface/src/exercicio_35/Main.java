package exercicio_35;

import exercicio_35.modelo.*;

public class Main {
    public static void main(String[] args) {
        /*
            Vamos construir Interfaces ?
        Toda Ave e Cachorro produzem algum tipo de som. Ave deve cantar e Cachorro deve latir.
        Além disto toda Ave e Cachorro possuem uma forma de se mover, mas cada um de seu jeito,
        ou seja Ave voa e Cachorro anda.
        Imagine que você precisa criar uma Interface Animal com métodos produzirSom() e mover().
        Estes métodos não possuem parâmetros ou retorno As classes Ave e Cachorro devem
        IMPLEMENTAR esta Interface. Para cachorro produzirSom() escreve na tela "Latir" e a Ave
        escreve "Cantar". O método mover() de cachorro escreve na tela "Andar" e a Ave "Voar". Veja
        que Ave e Cachorro podem ter seus próprios atributos e métodos se você quiser. Por exemplo
        nome.
        Crie o programa principal para testar as classe Cachorro e Ave. Lembre-se de organizar
        as classe em pacotes
         */

        Ave ave1 = new Ave("Canario", "Amarelo");
        Cachorro cachorro1 = new Cachorro("Kiara", "Vira-lata", 1);

        ave1.mover();
        ave1.produzirSom();
        cachorro1.mover();
        cachorro1.produzirSom();
    }
}

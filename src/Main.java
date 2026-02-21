import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Carro meucarro = new Carro("BMW");
        Carro meucarro2 = new Carro("ferrari");
        Carro meucarro3 = new Carro("AUDI");

        meucarro3.acelerar();

        Casa minhacasa = new Casa("Alugada");
        Casa minhacasa2 = new Casa("Financiada");

        minhacasa.comprar();

    }
}
    //construtor: chamado quando um objeto de uma classe for criado (Q merda é essa? calma bro
//isso serve pra dar especificações ao objeto internamente, tipo a marca de um carro)

class Carro {

    String marcadoCarro;

    public Carro(String marcadoCarro) {
        this.marcadoCarro = marcadoCarro;
    }

    public void acelerar() {
        System.out.println("Acelerando o carro da marca: " + this.marcadoCarro);
    }
}

class Casa {
    String modelocasa;

    public Casa(String modelocasa) {
        this.modelocasa = modelocasa;
    }

    public void comprar(){
        System.out.println("Vou me mudar para uma casa: " + this.modelocasa);
    }

}
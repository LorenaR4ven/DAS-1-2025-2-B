package br.univille.observer;

public class Cliente {

    public static void main(String[] args) {
        var publicador = new Publisher();
        var Maria = new ConcreteSubscriber();
        var Marcos = new ConcreteSubscriber();

        publicador.Subscribe(Maria);
        publicador.Subscribe(Marcos);

        publicador.setMainState("TO COM FOME!");
        publicador.notifySubscribers();
    }
}

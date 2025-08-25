package br.univille.observer;

public interface Subscriber {
    //interface que age como um action listener, precisando do "update" para ser notificado
    public void update(String context);
}

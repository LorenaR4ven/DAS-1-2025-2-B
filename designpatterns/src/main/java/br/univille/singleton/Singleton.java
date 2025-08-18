package br.univille.singleton;

public class Singleton {
    // Imita uma variavel global - "Static" é carregada primeiro na memória.
    private static Singleton instance;

    private Singleton() {
        
    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

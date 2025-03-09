package br.com.ada.desenvolva.repository;

public class CanetaImpl<T> implements Writer<T>{
    @Override
    public void write(T object) {
        System.out.println("Escrevendo a caneta");
        System.out.println(object.toString());
    }
}

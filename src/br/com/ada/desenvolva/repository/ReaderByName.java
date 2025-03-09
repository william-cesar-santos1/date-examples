package br.com.ada.desenvolva.repository;

public interface ReaderByName<T> {

    T read(String nome);

}

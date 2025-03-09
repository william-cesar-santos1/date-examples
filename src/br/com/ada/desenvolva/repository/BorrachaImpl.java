package br.com.ada.desenvolva.repository;

public class BorrachaImpl<T> implements Delete<T> {

    @Override
    public void delete(T object) {
        System.out.println("Aplicando a borracha sobre a escrita");
    }

}

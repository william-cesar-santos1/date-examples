package br.com.ada.desenvolva.repository;

import br.com.ada.desenvolva.model.Pessoa;

import java.util.List;

public class PessoaLeitorImpl implements Reader<Pessoa>, ReaderByName<Pessoa> {

    @Override
    public List<Pessoa> read() {
        System.out.println("Lendo dados de pessoas");
        return List.of();
    }

    @Override
    public Pessoa read(String nome) {
        System.out.println("Buscando por nome");
        return null;
    }

}

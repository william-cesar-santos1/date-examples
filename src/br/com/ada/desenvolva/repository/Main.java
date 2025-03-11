package br.com.ada.desenvolva.repository;

import br.com.ada.desenvolva.model.Carro;
import br.com.ada.desenvolva.model.Pessoa;
import br.com.ada.desenvolva.repository.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var william = new Pessoa();
        william.setNome("William");

        write(william, new LapisImpl<Pessoa>());

        var b20 = new Carro();
        b20.setModelo("b20 da massa");

        write(b20, new CanetaImpl<>());

        read(new PessoaLeitorImpl());

        delete(william, new BorrachaImpl<>());
        delete(b20, new BorrachaImpl<>());
    }

    public static <T> void write(T object, Writer<T> writer) {
        // Wildcard(?) - Deve ser evitado
        writer.write(object);
    }

    public static <T> List<T> read(Reader<T> reader) {
        return reader.read();
    }

    public static <T> void delete(T object, Delete<T> delete) {
        delete.delete(object);
    }

    /*
    modificador de acesso (public, protected, private e default)
    dono do método (object, classe(static))
    tipagem pode ser generica <T> (void para sem retorno)
    nome do método
    argumentos (tipagem do argumentos, nome do argumento)
     */

}

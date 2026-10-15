package org.example.dio;

import org.example.dio.jUnit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {

        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1,1, 15, 0,0));
        Assertions.assertEquals(26, jessica.getIdade());
    }


    @Test
    void deveRetornarEhMaiorDeIdade() {

        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1,1, 15, 0,0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

    }
}

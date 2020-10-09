package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ChachkieServiceTest {
    private ChachkieService chachkieService;

    @BeforeEach
    void initService(){
        chachkieService = new ChachkieService();
    }

    @Test
    void shouldOneGetchachkie(){
        Chachkie chachkie = chachkieService.getChachkie();
        assertThat(chachkie).isNotNull();
    }

    @Test
    void shouldReturnManyChachkies(){
        List<Chachkie> chachkies = chachkieService.getChachkies();
        assertThat(chachkies.size()).isGreaterThan(0);
    }
}

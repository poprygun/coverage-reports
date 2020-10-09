package com.example.demo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


class DemoApplicationTests {


    @Test
    void shouldRunTestOne() throws IOException {
        assertThat(1).isEqualTo(1);
    }


    @Test
    void shouldRunTestTwo() throws IOException {
        assertThat(2).isEqualTo(2);
    }


}

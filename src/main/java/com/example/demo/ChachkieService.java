package com.example.demo;

import java.util.Collections;
import java.util.List;

public class ChachkieService {
    public Chachkie getChachkie() {
        return new Chachkie();
    }

    public List<Chachkie> getChachkies() {
        return Collections.singletonList(new Chachkie());
    }
}

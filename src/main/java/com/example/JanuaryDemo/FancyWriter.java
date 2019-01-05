package com.example.JanuaryDemo;

import org.springframework.stereotype.Component;

/**
 * Created by johnmilito on 1/3/19.
 */
@Component

public class FancyWriter implements TextWriter {
    public String WriteText(String s) {
        return s + "fancy Text";
    }
}

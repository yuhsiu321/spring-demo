package at.fhtw.springdemo;

import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    void testPersonBuilder(){

        Person maxi = Person.builder()
                .name("maxi")
                .email("maxi@email.com")
                .build();

    }
}

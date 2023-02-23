package at.fhtw.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
class SpringDemoApplicationTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testPersonRepository(){
        Person maxi = Person.builder()
                .name("maxi")
                .email("maxi@email.com")
                .build();
        personRepository.save(maxi);
        personRepository.findAll().forEach(System.out::println);

    }
}

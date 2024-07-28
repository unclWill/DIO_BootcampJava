package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired // Faz a instancição do objeto.
    private Calculadora calc;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("RESULTADO DA SOMA: %d%n", calc.somar(10, 20));
    }
}

package dio.spring_porperties_value.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Mensagem enviada por: %s%nEmail: %s%nCom o telefone: %s%n",
                remetente.getNome(), remetente.getEmail(), remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado!");
    }
}

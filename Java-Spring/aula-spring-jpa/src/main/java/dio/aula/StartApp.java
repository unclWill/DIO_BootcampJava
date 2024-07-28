package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // Objeto gerenciado pelo Spring
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.filtrarPorNome("William");

        for (User usr : repository.findAll()) {
            System.out.println(usr);
        }
        //insertUser();
    }

    private void insertUser() {
        User user = new User();
        user.setName("William");
        user.setUsername("will");
        user.setPassword("pipapaparapo");

        repository.save(user);
    }
}
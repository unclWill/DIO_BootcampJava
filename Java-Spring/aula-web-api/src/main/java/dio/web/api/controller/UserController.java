package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users") // Aplica o /users para todos os métodos que dependem do mapeamento.
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getUsers(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody User user){
        repository.save(user);
    }

    @PutMapping
    public void update(@RequestBody User user){
        repository.save(user);
    }

    @GetMapping("/{username}")
    public User find(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }
}


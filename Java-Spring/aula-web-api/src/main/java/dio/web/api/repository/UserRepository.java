package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.RequiredFieldException;
import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        fieldsVerification(user);

        if(user.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(user);
    }

    private static void fieldsVerification(User user) {
        if (user.getLogin() == null) {
            throw new RequiredFieldException("login");
        }

        if (user.getPassword() == null) {
            throw new RequiredFieldException("password");
        }
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<User> usuarios = new ArrayList<>();

        usuarios.add(new User("william","pipapaparapo"));
        usuarios.add(new User("roberta","digdigdigta"));

        return usuarios;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("william","pipapaparapo");
    }

    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new User("william","pipapaparapo");
    }
}

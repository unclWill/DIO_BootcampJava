package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author William
 * @date 29/07/2024
 */

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}

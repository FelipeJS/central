package central.cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	public Cliente findByUsuarioAndSenha(String usuario, String senha);
}
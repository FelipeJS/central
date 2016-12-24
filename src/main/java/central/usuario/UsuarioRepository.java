package central.usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	public Usuario findByLoginAndSenha(String login, String senha);
}
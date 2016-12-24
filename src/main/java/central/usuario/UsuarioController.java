package central.usuario;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/consultar", method = GET)
	public Usuario consultar(@RequestParam Long codigo) {
		return usuarioService.obterUsuario(codigo);
	}

	@RequestMapping("/listar")
	public Iterable<Usuario> listar() {
		return usuarioService.obterTodos();
	}

	@RequestMapping(value = "/novo", method = POST)
	public Usuario novo(@RequestBody Usuario usuario) {
		return usuarioService.registrarUsuario(usuario);
	}

	@RequestMapping(value = "/autenticar", method = GET)
	public Usuario autenticar(@RequestParam String login, @RequestParam String senha) {
		return usuarioService.fazerLogin(login, senha);
	}
}
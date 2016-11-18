package central.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChamadoService {

  @Autowired
  private ChamadoRepository chamadoRepository;

  public Chamado registrarChamado(Chamado chamado) {
    return chamadoRepository.save(chamado);
  }

  public Chamado obterChamado(Integer codigo) {
    return chamadoRepository.findOne(codigo);
  }

  public Iterable<Chamado> obterTodos() {
    return chamadoRepository.findAll();
  }
}

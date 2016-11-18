package central.chamado;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import central.cliente.Cliente;

@Entity
public class Chamado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;

	@ManyToOne
	private Cliente cliente;

	@ManyToOne
	private Cliente tecnico;

	@Column(name = "TITULO")
	private String titulo;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "SEVERIDADE")
	private String severidade;

	@Column(name = "SUGESTAO")
	private String sugestao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ABERTO")
	private Calendar dataAberto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FECHADO")
	private Calendar dataFechado;

	@Column(name = "SOLUCAO")
	private String solucao;

	@Lob
	@Column(name = "ANEXO")
	private byte[] anexo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getTecnico() {
		return tecnico;
	}

	public void setTecnico(Cliente tecnico) {
		this.tecnico = tecnico;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSeveridade() {
		return severidade;
	}

	public void setSeveridade(String severidade) {
		this.severidade = severidade;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}

	public Calendar getDataAberto() {
		return dataAberto;
	}

	public void setDataAberto(Calendar dataAberto) {
		this.dataAberto = dataAberto;
	}

	public Calendar getDataFechado() {
		return dataFechado;
	}

	public void setDataFechado(Calendar dataFechado) {
		this.dataFechado = dataFechado;
	}

	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	public byte[] getAnexo() {
		return anexo;
	}

	public void setAnexo(byte[] anexo) {
		this.anexo = anexo;
	}

}

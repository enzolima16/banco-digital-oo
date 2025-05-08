import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void removerConta (Conta conta) {
		contas.remove(conta);
	}

	public void listarClientes() {
		if (contas.isEmpty()) {
			System.out.println("Nenhuma conta cadastrada no banco.");
			return;
		}

		System.out.println("Contas cadastradas no banco " + nome + ":");
		for (Conta conta : contas) {
			String tipoSaldo = conta.getSaldo() >= 0 ? "Saldo positivo" : "Conta em débito";
			System.out.println(conta + " - " + tipoSaldo);
		}
	}
}

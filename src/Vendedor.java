
public class Vendedor extends Funcionario{
	@Override
	public final void realizarAtividade() {
		// TODO Auto-generated method stub

		System.out.println("Vendas........");
		System.out.println("Nome: "+getNome());
		System.out.println("Cpf: "+getCpf());
	}
}

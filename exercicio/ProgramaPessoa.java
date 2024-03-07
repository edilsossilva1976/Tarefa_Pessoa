package exercicio;

public class ProgramaPessoa {

	public static void main(String[] args) {
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		System.out.println("***** Pessoa Física *****");
		pessoaFisica.setNome("Edilson Alves");
		pessoaFisica.setEndereco("QNL 4, taguatinga - DF");
		pessoaFisica.setTelefone("(61)9.6677-4312");
		pessoaFisica.setCpf("342.552.134-76");
		System.out.println(pessoaFisica.toString());
		System.out.print("CPF: ");
		imprimirDocumento(pessoaFisica);

		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		System.out.println("\n***** Pessoa Jurídica *****");
		pessoaJuridica.setNome("EAlves S/A");
		pessoaJuridica.setEndereco("Alameda dos Ministerios - Brasilia - DF");
		pessoaJuridica.setTelefone("(61)9.6322-7989");
		pessoaJuridica.setCnpj("12.345.678/0001-00");
		System.out.println(pessoaJuridica.toString());
		System.out.print("CNPJ: ");
		imprimirDocumento(pessoaJuridica);
	}
	
	public static void imprimirDocumento(Pessoa pessoa) {
		if (pessoa instanceof PessoaFisica) {
			PessoaFisica pFisica = (PessoaFisica)pessoa;
			System.out.println(pFisica.getCpf());
		}else {
			PessoaJuridica pJus = (PessoaJuridica)pessoa;
			System.out.println(pJus.getCnpj());
		}
	}
	

}

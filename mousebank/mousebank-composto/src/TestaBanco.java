
public class TestaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente guilherme = new Cliente();
		
		guilherme.nome = "Gui Carvalho";
		guilherme.cpf = "065.789.076-02";
		guilherme.profissao = "dev";
		
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.deposita(100);
		
		//fazer a composi��o dos objetos
		contaDoGuilherme.titular = guilherme; 
		System.out.println(contaDoGuilherme.titular.nome);
		
		//pegando o valor do saldo a partir de um m�todo para acesso de uma vari�vel privada (encapsulamento)
		System.out.println(contaDoGuilherme.getSaldo());
		
		
		
		
	}

}

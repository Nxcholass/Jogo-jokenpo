import java.util.Scanner;

// JOKENP�
public class Jogo {
	// Placar
	private static int placarJogador = 0;
	private static int placarComputador = 0;
	// Escolhas
	// 1 = Pedra | 2 = Papel | 3 = Tesoura
	private static int escolhaJogador;
	private static int escolhaComputador;
	
	// M�todo Principal
	public static void main(String[] args) {
		// Rodadas
		int rodadas = 0;
		int inicio = 0;
		// Input
		Scanner input = new Scanner(System.in);
		// Perguntar para o jogador
		System.out.println("::: JOKENPO :::");
		System.out.println("Ola voce deseja jogar JOKENPO?");
		System.out.println("(1) SIM (2) NAO");
		inicio = input.nextInt();
		
		while(inicio == 1) {
			System.out.println("Quantidade de rodadas: ");
			rodadas = input.nextInt();
		
		for(int i = 1; i <= rodadas; ++i) {
			escolhaComputador = (int) (Math.random()*3)+1;
			rotuloEscolhaJogador();
			escolhaJogador = input.nextInt();
			verificaResultado();
			exibePlacar();
			}
		// Reiniciar o jogo 0,25
		{
		int reiniciar = 0;
		Scanner input2 = new Scanner(System.in);
		System.out.println("");
		System.out.println("Quer continuar jogando?");
		System.out.println("(1) SIM (2) NAO");
		inicio = input2.nextInt();
		}
	}
		System.out.println("::::::::::::::::::::::::::");	
		System.out.println("OK, ATE A PROXIMA JOGADOR");
		System.out.println("::::::::::::::::::::::::::");
}

	private static void exibePlacar() {
		// 0,25
		System.out.println("");
		System.out.println("Jogador: " + placarJogador);
		System.out.println("Computador: " + placarComputador);
	}

	private static void verificaResultado() {
		// Verificar quem ganhou 
		// Atribuir ponto
		// 0,25
		if(escolhaComputador == 1 && escolhaJogador == 3) {
			System.out.println("Computador - Pedra VS Tesoura - Jogador");
			System.out.println("Computador ganhou!");
			placarComputador++;
		}	
		if(escolhaComputador == 2 && escolhaJogador == 1) {
			System.out.println("Computador - Papel VS Pedra - Jogador");
			System.out.println("Computador ganhou!");
			placarComputador++;
		}	
		if(escolhaComputador == 3 && escolhaJogador == 2) {
			System.out.println("Computador - Tesoura VS Papel - Jogador");
			System.out.println("Computador ganhou!");
			placarComputador++;
		}	
		if(escolhaComputador == 1 && escolhaJogador == 2) {
			System.out.println("Computador - Pedra VS Papel - Jogador");
			System.out.println("Jogador ganhou!");
			placarJogador++;
		}	
		if(escolhaComputador == 2 && escolhaJogador == 3) {
			System.out.println("Computador - Papel VS Tesoura - Jogador");
			System.out.println("Jogador ganhou!");
			placarJogador++;
		}	
		if(escolhaComputador == 3 && escolhaJogador == 1) {
			System.out.println("Computador - Tesoura VS Pedra - Jogador");
			System.out.println("Jogador ganhou!");
			placarJogador++;
		}	
		if(escolhaComputador == escolhaJogador) {
			System.out.println("Empate, escolheram o mesmo");
		}
	}

	private static void rotuloEscolhaJogador() {
		System.out.println("");
		System.out.println("::: JOGADOR, DIGITE: ");
		System.out.println(":: 1 - Pedra");
		System.out.println(":: 2 - Papel");
		System.out.println(":: 3 - Tesoura");
		System.out.println(":: Escolha sua opcao: ");
	}
	// 0,25 explicar o seu c�digo para o professor
}

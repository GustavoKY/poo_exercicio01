import java.util.Scanner;

public class Lanche {
	
	public static void main(String[] args) {
		int codigo = 0;
		int quantidade = 0;
		float preco = 0;
		Scanner input = new Scanner(System.in);
		
		codigo = input.nextInt();
		quantidade = input.nextInt();
		input.close();
		
		switch(codigo) {
			case 1:{
				preco = 4.0f * quantidade;
				break;
			}
			case 2:{
				preco = 4.5f * quantidade;
				break;
			}
			case 3:{
				preco = 5.0f * quantidade;
				break;
			}
			case 4:{
				preco = 2.0f * quantidade;
				break;
			}
			case 5:{
				preco = 1.5f * quantidade;
				break;
			}
		}
		
		System.out.println(String.format("Total: R$ %.02f", preco));
	}
}

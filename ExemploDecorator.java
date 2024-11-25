package DecoratorBiblioteca;

public class ExemploDecorator {
	public static void main(String[] args) {
		LivroInterface exemplo = new Livro();
		
		exemplo = new EmprestimoDecorator(exemplo);
		exemplo = new ReservaDecorator(exemplo);
		
		System.out.println(exemplo.obterDescricao());
		System.out.println("\nCusto total: R$" +exemplo.obterCusto());
	}
}

package DecoratorBiblioteca;

public class Livro implements LivroInterface {

    public String obterDescricao() {
		return "\nTitulo: Boa Noite Punpun\nAutor: Inio Asano\nGenero: slice of life";
	}
	
	public double obterCusto() {
		return 59.90;
	}
}

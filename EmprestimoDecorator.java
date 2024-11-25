package DecoratorBiblioteca;

public class EmprestimoDecorator extends LivroDecorator {
    public EmprestimoDecorator(LivroInterface livroInterface) {
        super(livroInterface);
    }

    public String obterDescricao() {
        return "[Emprestimo realizado] " +super.obterDescricao();
    }

    public double obterCusto() {
        return super.obterCusto() + 15.00;
    }
}
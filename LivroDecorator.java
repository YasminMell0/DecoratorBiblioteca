package DecoratorBiblioteca;

public abstract class LivroDecorator implements LivroInterface {
    protected LivroInterface livroInterface;

    public LivroDecorator(LivroInterface livroInterface) {
        this.livroInterface = livroInterface;
    }

    @Override
    public String obterDescricao() {
        return livroInterface.obterDescricao();
    }

    @Override
    public double obterCusto() {
        return livroInterface.obterCusto();
    }
}
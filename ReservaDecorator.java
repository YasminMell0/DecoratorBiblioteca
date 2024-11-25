package DecoratorBiblioteca;

public class ReservaDecorator extends LivroDecorator {
    public ReservaDecorator(LivroInterface livroInterface) {
        super(livroInterface);
    }
    
    public String obterDescricao() {
        return "[Reserva realizada] "  + super.obterDescricao();
    }

    public double obterCusto() {
        return super.obterCusto() + 10.00;
    }
}
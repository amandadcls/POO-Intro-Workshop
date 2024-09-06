public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Sedan";
        meuCarro.ano = 2021;

        meuCarro.acelerar();
    }
}

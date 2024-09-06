public class Aluno {
    // Atributos da classe Aluno
    private String nome;
    private int idade;
    private double[] notas; // Array para armazenar as notas do aluno

    // Construtor da classe Aluno
    public Aluno(String nome, int idade, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    // Método para exibir as informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    // Método para calcular a média das notas do aluno
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método principal para testar a classe Aluno
    public static void main(String[] args) {
        // Criando um aluno com nome, idade e um conjunto de notas
        double[] notasAluno = {8.5, 7.0, 9.0}; // Exemplo de notas
        Aluno aluno1 = new Aluno("João", 16, notasAluno);

        // Exibindo as informações do aluno
        aluno1.exibirInformacoes();

        // Calculando e exibindo a média das notas
        double media = aluno1.calcularMedia();
        System.out.println("Média das Notas: " + media);
    }
}

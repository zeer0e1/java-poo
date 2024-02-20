package Desafios.Principal.Classes;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    double avaliacoes;
    int numAvaliacoes;

    double mediaAvaliacoes;

    public void exibeFichaTecnica() {
        String text = """
                Nome da música: %s
                Artista: %s
                Quantidade de avaliações: %d
                """;
        System.out.printf(text, titulo, artista, numAvaliacoes);
    }

    public void avaliaMusica(double nota) {
        avaliacoes += nota;
        numAvaliacoes++;
    }

    public double mediaAvalicaoes() {
        return  avaliacoes / numAvaliacoes;
    }
}

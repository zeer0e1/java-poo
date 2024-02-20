public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso Chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

    }
}

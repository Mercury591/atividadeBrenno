import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        System.out.println("UNIFAN - Alfredo Nasser");
        System.out.println("Aluno: Danilo Serafim Lima");
        System.out.println("Professor: Brenno");
        System.out.println("Seja bem-vindo, a seguir você vai responder um quiz, com tema de Jogos em geral, bom quiz!");

        Quiz quiz = new Quiz();

        quiz.adicionarQuestao(new Questao("Qual é o nome do protagonista de \"The Legend of Zelda\"?", "A) Link", "B) Zelda", "C) Ganondorf", "D) Epona", "E) Navi", "A"));
        quiz.adicionarQuestao(new Questao("Em \"Super Mario Bros\", qual é o nome do irmão de Mario?", "A) Luigi", "B) Wario", "C) Yoshi", "D) Toad", "E) Bowser", "A"));

        quiz.executar();
    }


}

class Quiz {
    private List<Questao> questoes;
    private int pontuacao;

    public Quiz() {
        questoes = new ArrayList<>();
        pontuacao = 0;
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    }

    public void executar() {
        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                pontuacao++;
            }
            System.out.println("Sua pontuação atual é: " + pontuacao);
            System.out.println();
        }

        double pontuacaoFinal = 12.5;
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("Você acertou " + pontuacaoFinal + "% do quiz!");
        System.out.println("Quiz finalizado! Sua pontuação final é: " + pontuacao);
    }
}
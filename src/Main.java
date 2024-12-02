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
        quiz.adicionarQuestao(new Questao("Qual jogo popular apresenta uma ilha habitada por animais antropomórficos e permite que o jogador gerencie a ilha?", "A) Animal Crossing", "B) Stardew Valley", "C) Harvest Moon", "D) The Sims", "E) Minecraft", "A"));
        quiz.adicionarQuestao(new Questao("Em que ano foi lançado o primeiro jogo da série \"Call of Duty\"?", "A) 2001", "B) 2003", "C) 2005", "D) 2007", "E) 2009", "B"));
        quiz.adicionarQuestao(new Questao("Qual jogo de RPG tem como principal mecânica a captura e o treinamento de monstros chamados \"Pokémon\"?", "A) Digimon", "B) Final Fantasy", "C) Pokémon", "D) Dragon Quest", "E) Monster Hunter", "C"));
        quiz.adicionarQuestao(new Questao("Em \"Minecraft\", qual é o nome do material necessário para criar uma mesa de encantamento?", "A) Diamante", "B) Obsidiana", "C) Ferro", "D) Ouro", "E) Carvão", "B"));
        quiz.adicionarQuestao(new Questao("Qual é o nome do personagem principal em \"God of War\"?", "A) Ares", "B) Kratos", "C) Zeus", "D) Hades", "E) Hermes", "B"));
        quiz.adicionarQuestao(new Questao("Em \"League of Legends\", quantos jogadores compõem uma equipe padrão?", "A) 3", "B) 4", "C) 5", "D) 6", "E) 7", "C"));
        quiz.adicionarQuestao(new Questao("Qual é o objetivo principal do jogo \"Among Us\"?", "A) Construir bases", "B) Completar tarefas e descobrir os impostores", "C) Capturar bandeiras", "D) Coletar recursos", "E) Derrotar monstros", "B"));

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
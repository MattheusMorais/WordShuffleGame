package app;

import java.util.InputMismatchException;

import static utils.InputHandler.SC;

public class MenuSettings {
    private int OPTION;
    private String PLAYERNAME;
    private int DIFFICULTY;

    public int getOPTION() {
        try {
            OPTION = SC.nextInt();
            SC.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, digite um número.");
            SC.next(); // Clear buffer
        }
        if (OPTION == 2) {
            System.out.println("Fechando o jogo...");
        } else {
            System.out.println("Opção Inválida! Digite 1 ou 2.");
        }
        return OPTION;
    }

        public String getPLAYERNAME() {
        if (OPTION == 1) {
            System.out.println("Digite o nome do Jogador: ");
            PLAYERNAME = SC.nextLine();
        }
        return PLAYERNAME;
    }

    public int getDIFFICULTY() {
        try {
            DIFFICULTY = SC.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, digite um número.");
            SC.next(); // Clear buffer
        }
        SC.nextLine(); // Clear buffer
        switch (DIFFICULTY) {
            case 1:
            case 2:
                System.out.printf("Dificuldade %s escolhida!", DIFFICULTY);
            default:
                System.out.println("Opção Inválida! Digite 1 ou 2.");
        }
        return DIFFICULTY;
    }
}

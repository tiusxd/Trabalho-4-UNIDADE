package teste_trabalho;

import java.util.Scanner;

public class Util{

    public static final int ALUNO_LISTA = 0, DOCENTE_LISTA = 1, DISCPLINA_LISTA = 2, TURMA_LISTA = 3;
    public static String lerString(){
        Scanner input = new Scanner(System.in);
        String toReturn = "";
        while (true){
            try{
            System.out.println("Digite a palavra/frase:");
            toReturn = input.nextLine();
            if (toReturn.isBlank()){
                System.out.println("Resposta inválida. Digite um valor frase");
                continue;
            }
            break;
            } catch (Exception ex){
                System.out.println("Ocorreu um erro. Por favor, digite novamente");
                continue;
            }
        }
        input.close();
        return toReturn;
    }

    public static int lerInteger(){
        Scanner input = new Scanner(System.in);
        int toReturn;
        while(true){
            System.out.println("Digite o número inteiro:");
            try{
                toReturn = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException nf){
                 System.out.println("Número inválido. Digite um número inteiro (sem vírgulas ou pontos)"
                 +" entre -2147483648 e +2147483648");
                 continue;
            } catch (Exception ex){
                System.out.println("Ocorreu um erro. Por favor, digite novamente.");
                continue;
            }
        }
        input.close();
        return toReturn;
    }

    public static float lerFloat(){
        Scanner input = new Scanner(System.in);
        float toReturn;
        while(true){
            System.out.println("Digite o número real:");
            try{
                toReturn = Float.parseFloat(input.nextLine());
                break;
            } catch (NumberFormatException nf){
                 System.out.println("Número inválido. Digite um número real, utilizando PONTO como separador do decimal.");
                 continue;
            } catch (Exception ex){
                System.out.println("Ocorreu um erro. Por favor, digite novamente.");
                continue;
            }
        }
        input.close();
        return toReturn;
    }
}


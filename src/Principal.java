import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gestão escolar");

        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe o nome do Aluno(a): ");
        var nomeAluno = leitura.nextLine();

        System.out.println("Informe a idade do Aluno(a): ");
        var idadeAluno = leitura.nextInt();
        var opcao = 0;
        var somaDasNotas = 0.0;
        int quantidadeDeNotas = 0;
        Boolean notaZero = false;

        while(opcao != -1) {
            System.out.println("Digite a nota do Estudante: ");
            var nota = leitura.nextDouble();
            if (nota == 0) {
                notaZero = true;
            }
            somaDasNotas += nota;
            quantidadeDeNotas++;
            System.out.println("(1) - Para informa mais nota e (-1) para sair");
            opcao = leitura.nextInt();
        }

        var media = somaDasNotas / quantidadeDeNotas;

        if(media >= 7 && notaZero == false) {
            System.out.println("Parabens " + nomeAluno + " você passou de ano !");
            System.out.println("Sua Média foi: " + media);
        } else  {

            System.out.println("Vacilou " + nomeAluno + " você está de DP :/");
            if (notaZero) {
                System.out.println("Você tirou zerou em uma das provas !");
            }
            System.out.println("Sua Média foi: " + media);
        }


    }
}

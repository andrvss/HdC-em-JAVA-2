/*  Exercício 1
package HoraDeCodar2;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número");
        int n = ler.nextInt();
        if (n > 0) {
            System.out.println("O número é positivo.");
        }
        else if (n < 0) {
            System.out.println("O número é negativo.");
        }
        else {
            System.out.println("O número é zero.");
        }
        ler.close();
    }
} */

/* Exercício 2 
package HoraDeCodar2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int n1 = ler.nextInt();
        System.out.println("Informe o segundo valor:");
        int n2 = ler.nextInt();
        System.out.println("Informe o terceiro valor:");
        int n3 = ler.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O primeiro valor de " + n1 + " é maior ");
        }
        if (n2 > n1 && n2 > n3) {
            System.out.println("O segundo valor de " + n2 + " é maior ");
        }
        if (n3 > n1 && n3 > n2) {
            System.out.println("O terceiro valor de " + n3 + " é maior ");
        }
        ler.close();
    }
} */

/* Exercício 3 
package HoraDeCodar2;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o primeiro número?");
        int n1 = ler.nextInt();
        System.out.println("Qual o segundo número?");
        int n2 = ler.nextInt();
        System.out.println("Qual o terceiro número?");
        int n3 = ler.nextInt();
        int soma;

        if (n3 < n1 && n1 < n2) {
            soma = n1 + n2;
            System.out.println("A soma será: " + soma);
        }

        else if (n2 < n1 && n1 < n3) {
            soma = n1 + n3;
            System.out.println("A soma será: " + soma);
        }

        else if (n1 > n3) {
            soma = n1 + n2;
            System.out.println("A soma será: " + soma);
        }
        else {
            soma = n2 + n3;
            System.out.println("A soma será: " + soma);
        }
        ler.close();
    }
} */

/* Exercício 4 
package HoraDeCodar2;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;

        for( int i = 0; i <10; i++ ){
            System.out.print("Digite um valor: ");
            int num = ler.nextInt();
            soma += num;
        }

        System.out.println("A média da soma dos valores é " + soma/10);
        ler.close();
    }
} */

/* Exercício 5 
package HoraDeCodar2;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;

        for(int i = 0; i < 4; i++ ){
            System.out.print("Digite a nota do aluno: ");
            int notas = ler.nextInt();

            while( notas > 10 || notas < 0 ){
                System.out.print("Por favor digite uma nota maior que 0 e menor que 10: ");
                notas = ler.nextInt();
            }

            soma += notas;
        }

        double media = soma/4;
        System.out.println("Sua média foi " + media);

        if( media >= 6 ){
            System.out.println("PARABÉNS! Você foi aprovado !!");
        } else{
            System.out.println("Que pena, você foi reprovado...");
        }
        ler.close();
    }
} */
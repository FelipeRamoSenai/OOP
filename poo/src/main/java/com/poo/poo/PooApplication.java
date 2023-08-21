package com.poo.poo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Aluno;
import com.poo.poo.classes.Conta;
import com.poo.poo.classes.Veiculo;

@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
		System.out.println("Escreva o nome do aluno:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a data de nascimento:");
		Scanner dt = new Scanner(System.in);
		Aluno aluno = new Aluno(sc.nextLine(), sc.nextLine());

		System.out.println(aluno.getAluno());
		System.out.println(aluno.getDataNascimento());
		System.out.println(aluno.getMatricula());



		Aluno aluno1 = new Aluno(sc.nextLine(), sc.nextLine());
		System.out.println("Escreva o nome do aluno:");
		Scanner sc1 = new Scanner(System.in);
		System.out.println(aluno1.getAluno());
		System.out.println(aluno1.getDataNascimento());
		System.out.println(aluno1.getMatricula());

		

	}
}

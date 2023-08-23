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
		String nome, data;
		System.out.println("Escreva o nome do aluno:");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		System.out.println("Digite a data de nascimento:");
		data = sc.nextLine();
		Aluno aluno = new Aluno(nome, data );

		System.out.println(aluno.getAluno());
		System.out.println(aluno.getDataNascimento());
		System.out.println("PET000" + aluno.getMatricula());


		System.out.println("Escreva o nome do aluno:");
		nome = sc.nextLine();
		System.out.println("Digite a data de nascimento:");
		data = sc.nextLine();
		Aluno aluno1 = new Aluno(nome, data);
		System.out.println(aluno1.getAluno());
		System.out.println(aluno1.getDataNascimento());
		System.out.println("PET000" + aluno1.getMatricula());

		System.out.println("Escreva o  nome do aluno:");
		nome = sc.nextLine();
		System.out.println("Digite a data de nascimento:");
		data = sc.nextLine();
		Aluno aluno2 = new Aluno(nome, data);

		System.out.println(aluno2.getAluno());
		System.out.println(aluno2.getDataNascimento());
		System.out.println("PET000" + aluno2.getMatricula());

		

	}
}

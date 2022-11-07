package atividaderafa;

import java.util.Scanner;

public class Atividade {

	public static void main(String[]args) {

		Scanner scan = new Scanner(System.in);
		//Notas em Reais
		int UM = 1;
		int DOIS = 2;
		int CINCO = 5;
		int DEZ = 10;
		int VINTE = 20;
		int CINQUENTA = 50;
		int CEM = 100;

		//Variavel do valor inserido no caixa

		int valor;


		System.out.println("Digite o Valor a ser inserido");
		valor = scan.nextInt();

		//Exibir notas necessarias para inserir o valor

		if(valor >= CEM ) { //Exibe quantas notas de 100 sao necessarias
			CEM = valor/CEM;
			valor = valor %100; //remove os numeros da casa de centena(para nao serem exibidos novamente)

			if(CEM ==1 ){
				System.out.println(CEM + " Nota de Cem");

			}else if(CEM >= 2) {
				System.out.println(CEM + " Notas de Cem");
			}
		}
		if(valor >= CINQUENTA ) { //Exibe quantas notas de 50 sao necessarias
			CINQUENTA = valor/CINQUENTA;
			valor = valor %50; //remove os valores 50 ja usados 

			if(CINQUENTA ==1 ){
				System.out.println(CINQUENTA + " Nota de cinquenta");

			}else if(CINQUENTA >= 2) {
				System.out.println(CINQUENTA + " Notas de cinquenta");
			}
		}
		if(valor >= VINTE ) { //Exibe quantas notas de 20 sao necessarias
			VINTE = valor/VINTE;
			valor = valor %20; //remove os valores 20 ja usados

			if(VINTE ==1 ){
				System.out.println(VINTE + " Nota de vinte");

			}else if(VINTE >= 2) {
				System.out.println(VINTE + " Notas de vinte");
			}
		}
		if(valor >= DEZ ) { //Exibe quantas notas de 10 sao necessarias
			DEZ = valor/DEZ;
			valor = valor %10; //remove os valores 10 ja usados
			
			if(DEZ ==1 ){
				System.out.println(DEZ + " Nota de dez");
				
			}else if(DEZ >= 2) {
				System.out.println(DEZ + " Notas de dez");
			}
		}
		if(valor >= CINCO ) { //Exibe quantas notas de 5 sao necessarias
			CINCO = valor/CINCO;
			valor = valor %5; //remove os valores 5 ja usados
			
			if(CINCO ==1 ){
				System.out.println(CINCO + " Nota de cinco");
				
			}else if(CINCO >= 2) {
				System.out.println(CINCO + " Notas de cinco");
			}
		}
		if(valor >= DOIS ) { //Exibe quantas notas de 2 sao necessarias
			DOIS = valor/DOIS;
			valor = valor %2; //remove os valores 2 ja usados
			
			if(DOIS ==1 ){
				System.out.println(DOIS + " Nota de dois");
				
			}else if(DOIS >= 2) {
				System.out.println(DOIS + " Notas de dois");
			}
		}
		if(valor >= UM ) { //Exibe quantas notas de 1 sao necessarias
			UM = valor/UM;
			valor = valor %1; //remove os valores 1 ja usados
			
			if(UM ==1 ){
				System.out.println(UM + " Nota de um");
				
			}else if(UM >= 2) {
				System.out.println(UM + " Notas de um");
			}
		}
	}
}

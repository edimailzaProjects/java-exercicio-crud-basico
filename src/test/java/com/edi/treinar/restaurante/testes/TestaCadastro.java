package com.edi.treinar.restaurante.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.edi.treinar.restaurante.classes.Alimento;
import com.edi.treinar.restaurante.classes.Comida;
import com.edi.treinar.restaurante.servicos.MenuServico;

public class TestaCadastro
{
    public static void main(String[] args)
    {
        int codigo;
        int categoria;
        int quantidade;
        String nome;
        double valor;
        int escolha;
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        MenuServico menuServico = new MenuServico();

        try
        {
            System.out.println("Deseja cadastrar um alimento?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            escolha = scanner.nextInt();

            while (escolha != 2)
            {//se categoria 1- vai pra lista de comida e terá a decisão do tipo de prato
                Alimento alimento = new Comida();

                
                System.out.println("Digite o código do alimento: ");
                codigo = scanner.nextInt();
                alimento.setCodigo(codigo);

                System.out.println("Digite a quantidade disponível: ");
                quantidade = scanner.nextInt();
                alimento.setQuantidade(quantidade);

                System.out.println("Digite o nome deste alimento: ");
                nome = scanner.next();
                alimento.setNome(nome);
                
                System.out.println("Digite a categoria do alimento: ");
                System.out.println("1 - Comida");
                System.out.println("2 - Bebida");
                categoria = scanner.nextInt();
                alimento.setCategoria(categoria);

                System.out.println("Digite o valor deste alimento: ");
                valor = scanner.nextDouble();
                alimento.setValor(valor);

                System.out.println();

                System.out.println(menuServico.cadastraAlimentos(alimento));

                try
                {
                    System.out.println("Deseja cadastrar um alimento?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    escolha = scanner.nextInt();
                }
                catch (Exception e)
                {
                    System.out.println("Entrada inválida.");
                }

            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Entrada inválida.");
        }

    }

}

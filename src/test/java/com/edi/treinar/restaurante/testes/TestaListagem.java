package com.edi.treinar.restaurante.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.edi.treinar.restaurante.classes.Alimento;
import com.edi.treinar.restaurante.servicos.MenuServico;

public class TestaListagem
{
    public static void main(String[] args)
    {
        int codigo;
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
            {
                Alimento alimento = new Alimento();
                System.out.println("Digite o código do alimento: ");
                codigo = scanner.nextInt();
                alimento.setCodigo(codigo);

                System.out.println("Digite a quantidade disponível: ");
                quantidade = scanner.nextInt();
                alimento.setQuantidade(quantidade);

                System.out.println("Digite o nome deste alimento: ");
                nome = scanner.next();
                alimento.setNome(nome);

                System.out.println("Digite o valor deste alimento: ");
                valor = scanner.nextDouble();
                alimento.setValor(valor);

                System.out.println();

                System.out.println(menuServico.cadastraAlimentos(alimento));

                try
                {
                    System.out.println();
                    System.out.println("Deseja cadastrar um novo alimento?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    escolha = scanner.nextInt();
                }
                catch (Exception e)
                {
                    System.out.println("Entrada inválida.");
                }
                
            }
            
            System.out.println(menuServico.getListaAlimento());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Entrada inválida.");
        }
    }

}

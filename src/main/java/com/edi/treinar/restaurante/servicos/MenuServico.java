package com.edi.treinar.restaurante.servicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edi.treinar.restaurante.classes.Alimento;
import com.edi.treinar.restaurante.interfaces.MenuInterface;

public class MenuServico implements MenuInterface
{
    Scanner scanner = new Scanner(System.in);
    private List<Alimento> listaAlimento = new ArrayList<>();

    @Override
    public String cadastraAlimentos(Alimento alimento)
    {
        if (!listaAlimento.contains(alimento))
        {
            listaAlimento.add(alimento);
        }
        else
        {
            return "Código do alimento já cadastrado.";
        }
        return "Alimento cadastrado com sucesso!";
    }

    public List<Alimento> getListaAlimento()
    {
        return listaAlimento;
    }

    @Override
    public void editaAlimentos(Alimento alimento)
    {
        int novaQuantidade;
        String novoNome;
        double novoValor;
        int escolha;

        if (listaAlimento.contains(alimento))
        {
            System.out.println("Escolha o campo que deseja editar: ");
            System.out.println("1 - Quantidade");
            System.out.println("2 - Nome");
            System.out.println("3 - Valor");
            escolha = scanner.nextInt();

            switch (escolha)
            {
            case 1:
                System.out.println("Digite a nova quantidade: ");
                novaQuantidade = scanner.nextInt();
                alimento.setQuantidade(novaQuantidade);
                System.out.println("A nova quantidade é: " + alimento.getQuantidade());
                System.out.println(listaAlimento.toString());
                break;

            case 2:
                System.out.println("Digite o novo nome: ");
                novoNome = scanner.next();
                alimento.setNome(novoNome);
                System.out.println("O novo nome é: " + alimento.getNome());
                System.out.println(listaAlimento.toString());

            case 3:
                System.out.println("Digite o novo valor: ");
                novoValor = scanner.nextDouble();
                alimento.setValor(novoValor);
                System.out.println("O novo valor é: " + alimento.getValor());
                System.out.println(listaAlimento.toString());

            default:
                break;
            }

            alimento.getNome();
        }
        else
            System.out.println("Código inexistente.");

    }

    @Override
    public void removeAlimento(List<Alimento> listaAlimento, Alimento alimento)
    {
        if (listaAlimento.contains(alimento))
        {
            System.out.println("Item " + alimento.getNome() + " removido com sucesso");
            listaAlimento.remove(alimento);
        }
        else
        {
            System.out.println("Item não cadastrado.");
        }

    }

}

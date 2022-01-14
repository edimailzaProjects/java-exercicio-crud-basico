package com.edi.treinar.restaurante.testes;

import java.util.ArrayList;
import java.util.List;

import com.edi.treinar.restaurante.classes.Alimento;
import com.edi.treinar.restaurante.classes.CalculaQuantidade;

public class TestaCalculaQuantidade
{
    public static void main(String[] args)
    {
        Alimento arroz = new Alimento();
        Alimento bife = new Alimento();
        Alimento salada = new Alimento();
        List<Alimento> listaDeAlimentos = new ArrayList<>();
        CalculaQuantidade calculaQuantidade = new CalculaQuantidade();

        arroz.setCodigo(1);
        arroz.setNome("Arroz a grega");
        arroz.setQuantidade(3);
        arroz.setValor(10.0);

        bife.setCodigo(2);
        bife.setNome("Bife a Milanesa");
        bife.setQuantidade(1);
        bife.setValor(30.0);

        salada.setCodigo(2);
        salada.setNome("Salada Caesar");
        salada.setQuantidade(2);
        salada.setValor(5.0);

        listaDeAlimentos.add(arroz);
        listaDeAlimentos.add(bife);
        listaDeAlimentos.add(salada);

        System.out.println(arroz.toString() + "---Total: R$" + calculaQuantidade.calculaItemAlimento(arroz));
        System.out.println(bife.toString() + "---Total: R$" + calculaQuantidade.calculaItemAlimento(bife));
        System.out.println(salada.toString() + "---Total: R$" + calculaQuantidade.calculaItemAlimento(salada));
        
        System.out.println("---MENU----");
        
        System.out.println(listaDeAlimentos.toString());
        
        System.out.println("TOTAL: R$" + calculaQuantidade.calculaTotal(listaDeAlimentos));

    }
}

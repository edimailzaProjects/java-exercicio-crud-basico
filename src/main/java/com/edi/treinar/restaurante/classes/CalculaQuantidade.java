package com.edi.treinar.restaurante.classes;

import java.util.List;

public class CalculaQuantidade
{
    private static double soma;
    
    public double calculaItemAlimento(Alimento alimento) {
        return alimento.getQuantidade() * alimento.getValor();
    }
    
    public double calculaTotal(List<Alimento> alimento)
    {
        double total = 0;
        for (int i = 0; i < alimento.size(); i++)
        {
            total = alimento.get(i).getValor() * alimento.get(i).getQuantidade();
            CalculaQuantidade.soma += total;
        }

        return CalculaQuantidade.soma;
    }

    public static double getSoma()
    {
        return soma;
    }

}

package com.edi.treinar.restaurante.testes;

import java.util.ArrayList;
import java.util.List;

import com.edi.treinar.restaurante.classes.Alimento;
import com.edi.treinar.restaurante.servicos.MenuServico;

public class TestaExclusao
{
    public static void main(String[] args)
    {
        MenuServico menu = new MenuServico();
        List<Alimento> listaAlimento = new ArrayList<>();
        Alimento alimento = new Alimento();
        
        alimento.setCategoria(1);
        alimento.setCodigo(1);
        alimento.setNome("Filé a Parmegiana");
        alimento.setQuantidade(2);
        alimento.setValor(10.0);
        listaAlimento.add(alimento);
        
        System.out.println("Alimento registrado");
        System.out.println(listaAlimento.toString());

        menu.removeAlimento(listaAlimento, alimento);
        
        System.out.println("Alimento removido");
        System.out.println(listaAlimento.toString());
    }

}

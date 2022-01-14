package com.edi.treinar.restaurante.testes;

import com.edi.treinar.restaurante.classes.Alimento;
import com.edi.treinar.restaurante.servicos.MenuServico;

public class TestaEdicao
{
    public static void main(String[] args)
    {
        MenuServico menuServico = new MenuServico();

        Alimento pudim = new Alimento();
        Alimento coxinha = new Alimento();
        Alimento vitamina = new Alimento();
        
        pudim.setCategoria(1);
        pudim.setCodigo(1);
        pudim.setQuantidade(2);
        pudim.setNome("Pudim");
        pudim.setValor(3.5);
        
        coxinha.setCategoria(1);
        coxinha.setCodigo(2);
        coxinha.setQuantidade(10);
        coxinha.setNome("Coxinha");
        coxinha.setValor(5);
        
        vitamina.setCategoria(3);
        vitamina.setCodigo(3);
        vitamina.setQuantidade(6);
        vitamina.setNome("Vitamina");
        vitamina.setValor(4);
        
        menuServico.cadastraAlimentos(pudim);
        menuServico.cadastraAlimentos(coxinha);
        menuServico.cadastraAlimentos(vitamina);

        System.out.println(menuServico.getListaAlimento());
        
        menuServico.editaAlimentos(vitamina);
        
        System.out.println(menuServico.getListaAlimento());
    }

}

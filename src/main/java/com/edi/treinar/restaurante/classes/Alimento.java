package com.edi.treinar.restaurante.classes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alimento // implementar ou não (Bebida e Comida)
{
    private int codigo;
    private int categoria;
    private int quantidade;
    private String nome;
    private double valor;

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alimento other = (Alimento) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "categoria" + categoria + "....codigo: " + codigo + "....quantidade: " + quantidade + "...." + nome + "....."
                + valor + "\r\n";
    }

}

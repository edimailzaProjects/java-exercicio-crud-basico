package com.edi.treinar.restaurante.classes;

public class Bebida extends Alimento
{

    public double getValorGarrafa()
    {
        return super.getValor() * 5;
    }

    public double aplicaPromocao(boolean cupom)
    {   
        if (cupom)
        {
            super.setValor(0);
            return super.getValor();
        }
        else
            return super.getValor();
    }

}

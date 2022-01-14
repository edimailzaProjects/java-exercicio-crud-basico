package com.edi.treinar.restaurante.classes;

public class Comida extends Alimento
{
    public double getValorMeio()
    {
        return (super.getValor() * 2) / 1.1;
    }

    public double getValorCompleto()
    {
        return (this.getValorMeio() * 2) / 1.2;
    }
    
    
    public void setValorMeio(double valor)
    {
        double valorMeio = valor;
        valorMeio = this.getValorMeio();
        super.setValor(valorMeio);
    }
    
    public void setValorCompleto(double valor)
    {
        double valorCompleto = valor;
        valorCompleto = this.getValorCompleto();
        super.setValor(valorCompleto);
    }
}

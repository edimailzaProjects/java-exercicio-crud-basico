package com.edi.treinar.restaurante.interfaces;

import java.util.List;

import com.edi.treinar.restaurante.classes.Alimento;

public interface MenuInterface
{
    public abstract String cadastraAlimentos(Alimento alimento);
    
    public abstract void editaAlimentos(Alimento alimento);
    
    public abstract void removeAlimento(List<Alimento> listaAlimento, Alimento alimento);

}

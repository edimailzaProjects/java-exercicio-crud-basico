package com.edi.treinar.restaurante.classes;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu
{
    private List<Bebida> bebida = new ArrayList<>();
    private List<Comida> comida = new ArrayList<>();
    
    @Override
    public String toString()
    {
        return "Menu [bebida=" + bebida + ", comida=" + comida + "]";
    }
}

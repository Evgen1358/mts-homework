package ru.mts.certmanager.HW;


public class AbstractAnimal implements Animal{
    protected String brd = " *Порода: ";
    protected String nm = " *Кличка: ";
    protected String cst = " *Цена: ";
    protected String chr = " *Характер: ";
    @Override
    public String getBreed(String breed) {

        return breed;
    }
    @Override
    public String getName(String name) {
        return name;
    }
    @Override
    public Double getCost(Double cost) {
        return cost;
    }
    @Override
    public String getCharacter(String character) {
        return character;
    }
}

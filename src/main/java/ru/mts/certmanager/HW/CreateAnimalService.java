package ru.mts.certmanager.HW;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalService extends AbstractAnimal {
    public String create10Animals() {
        int cnt = 10;
        List<String> animals = new ArrayList<>();
        while (cnt > 0) {
            String[] breeds = {"Кошка", "Собака", "Волк", "Акула", "Лошадь"};
            String[] names = {"Барсик", "Пушок", "Арчи", "Стрела", "Глаша"};
            double minCost = 10.0;
            double maxCost = 100.0;
            String[] characters = {"Игривый", "Нейтральный", "Агрессивный", "Дружелюбный", "Холодный"};
            Random random = new Random();
            String breed = breeds[random.nextInt(breeds.length)];
            String name = names[random.nextInt(names.length)];
            double cost = minCost + (maxCost - minCost) * random.nextDouble();
            String character = characters[random.nextInt(characters.length)];
            String txt = (brd + getBreed(breed) + nm + getName(name) + cst + getCost(cost).toString() + chr + getCharacter(character));
            animals.add(txt);
            cnt--;
        }
        StringBuilder strBuild = new StringBuilder();
        for (String item : animals) {
            strBuild.append(item).append("\n");
        }
        return strBuild.toString();
    }
}
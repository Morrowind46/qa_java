package com.example;

import java.util.List;

// Чтобы внедрить в класс Alex зависимость, нужно создать объекты в другом классе — например, MainAlex:
class MainAlex {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        alex.getKittens ();
        alex.getFriends ();
        alex.getPlaceOfLiving ();
    }
}

// 1.Создаем зависимость, используемую в Алексе — feline
// 2.Передаем его в конструктор Алекса (у конструктора должен быть параметр для этого)
// 3.Там передаем его в конструктор Льва (как вызвать конструктор родительского класса? super тут пригодится)
// 4.Там кладем его в поле Feline feline

public class Alex extends Lion {
    // Нужно задать значение переменной извне — в другом классе. В класс Alex оно попадёт через конструктор как параметр.
    // объект feline — поле класса Alex

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
        }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский Зоопарк";
    }
}

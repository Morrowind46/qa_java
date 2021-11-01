package com.example;

import java.util.List;

// Чтобы внедрить в класс Lion зависимость, нужно создать объекты в другом классе — например, Main:
class Main {
    public static void main(String[] args) throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец",feline);
        lion.getKittens();
        lion.doesHaveMane ();
        lion.getFood ();
    }
}

public class Lion {
        // Нужно задать значение переменной извне — в другом классе. В класс Lion оно попадёт через конструктор как параметр.
        // объект feline — поле класса Lion
        protected Feline feline;
        boolean hasMane;

        public Lion(String sex, Feline feline) throws Exception {
            if ("Самец".equals (sex)) {
                hasMane = true;
            } else if ("Самка".equals (sex)) {
                hasMane = false;
            } else {
                throw new Exception ("Используйте допустимые значения пола животного - самей или самка");
            }
            this.feline = feline;
        }

        //   Feline feline = new Feline();

        public int getKittens() {
            return feline.getKittens();
        }

        public boolean doesHaveMane() {
            return hasMane;
        }

        public List<String> getFood() throws Exception {
            return feline.getFood("Хищник");
        }
    }
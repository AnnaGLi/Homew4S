//Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту!)
//        *реализовать сортировку по возрасту с использованием индексов
//        *реализовать сортировку по возрасту и полу с использованием индексов
package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Ivanov", "petr", "ivanovich", 32, "male");
        users[1] = new User("Kuzmin", "artem", "nikolaevich", 28, "male");
        users[2] = new User("Petrov", "anton", "mikhaylovich", 22, "male");
        users[3] = new User("Pavlov", "ivan", "valeryevich", 38, "male");
        users[4] = new User("Koshkin", "alexey", "sergeevich", 42, "male");
        users[5] = new User("Sidorov", "alexandr", "antonovich", 56, "male");
        users[6] = new User("Popov", "sergey", "artemyevich", 48, "male");
        users[7] = new User("Galicin", "mikhail", "petrovich", 38, "male");
        users[8] = new User("Shvatko", "ilya", "vladimirovich", 40, "male");
        users[9] = new User("Semin", "vasiliy", "alexandrovich", 25, "male");


        Integer[] index = new Integer[users.length];
        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }

        for (int i = 0; i < users.length; i++) {
            int ind = index[i];
            System.out.println(users[ind].getLastName() + " " + users[ind].getFirstName() + " " + users[ind].getMiddleName() + " " + users[ind].getAge() + " " + users[ind].getGender());
        }
        System.out.println("-------------------------------------------------------------------");

        String option; //        добавить возможность выхода или вывода списка отсортированного по возрасту!)
        String options = "type sort or null if to exit";
        String sort = "sort";
        option = JOptionPane.showInputDialog(null, sort, options, JOptionPane.QUESTION_MESSAGE);
        if (option == options) System.exit(0);

        else if (option.equals(sort)) {

            Arrays.sort(index, new Comparator<Integer>() {
                public int compare(Integer i1, Integer i2) {
                    return Integer.compare(users[i1].getAge(), users[i2].getAge()); //        добавить возможность выхода или вывода списка отсортированного по возрасту!)
                }

            });
            for (int i = 0; i < users.length; i++) {
                int ind = index[i];
                System.out.println(users[ind].getLastName() + " " + users[ind].getFirstName().toUpperCase().charAt(0) + " " + users[ind].getMiddleName().toUpperCase().toUpperCase().charAt(0) + " " + users[ind].getAge() + " " + users[ind].getGender());
            }
        }
    }
}
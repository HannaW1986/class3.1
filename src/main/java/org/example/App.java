package org.example;


public class App {
    public static void main(String[] args) {

        //Zadanie 2
        // Stwórz tablicę nazw europejskich miast i następnie wypisz je na następujące sposoby:
        // - od początku do końca
        // - od końca do początku
        // - co drugie miasto

        String[] cities = new String[5];
        cities[0] = "Warsaw";
        cities[1] = "Rome";
        cities[2] = "Paris";
        cities[3] = "Barcelona";
        cities[4] = "Berlin";

        System.out.println("Task 2a:");
        for (Integer i = 0; i < cities.length; i++) {
            String city = cities[i];
            System.out.println(city);
        }

        System.out.println("Task 2b:");
        for (Integer i = cities.length - 1; i >= 0; i--) {
            String city1 = cities[i];
            System.out.println(city1);
        }

        System.out.println("2c");
        for (Integer i = 0; i < cities.length; i += 2) {
            String city2 = cities[i];
            System.out.println(city2);
        }


        // Zadanie 3:
        //Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.
        System.out.println("Task 3");

        Double[] number = new Double[4];
        number[0] = 1.5;
        number[1] = 2.5;
        number[2] = 3.5;
        number[3] = 4.5;

        System.out.println("Sum of all numbers in table");

        Double sum = 0.0;


        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println(sum);

        System.out.println("Average of numbers:");

        Double average = sum / number.length;

        System.out.println(average);

        // Zadanie 4:
        // Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan".

        System.out.println("Task 4:");

        String[] names = new String[7];
        names[0] = "Jan";
        names[1] = "Piotr";
        names[2] = "Jan";
        names[3] = "Karol";
        names[4] = "Wojciech";
        names[5] = "Jan";
        names[6] = "Jan";


        int numberOfNames = 0;
        String searchedName = "Jan";

        for (Integer i = 0; i < names.length; i++) {
            String name1 = names[i];
            if (name1 == searchedName) {
                numberOfNames++;
            }
        }
        System.out.println("There are: " + numberOfNames + " names 'Jan' in this array.");

        // Zadanie 5:
        //Stwórz tablicę imion (bez powtórzeń) i następnie podaj, na którym indexie znajduje się w niej imię "Jan".
        System.out.println("Task 5:");

        String[] namesNew = new String[7];
        namesNew[0] = "Tomasz";
        namesNew[1] = "Piotr";
        namesNew[2] = "Jan";
        namesNew[3] = "Karol";
        namesNew[4] = "Wojciech";
        namesNew[5] = "Michal";
        namesNew[6] = "Adam";

        int numberOfNamesNew = 0;
        String searchedNameNew = "Jan";

        for (Integer i = 0; i < namesNew.length; i++) {
            String name = namesNew[i];
            if (name == searchedNameNew) {
                System.out.println("In this array name 'Jan' has index number: " + i );
            }
        }


            //Zadanie 6
            // Stwórz tablicę liczb całkowitych i następnie znajdź największy i najmniejszy element tej tablicy.

            System.out.println("Task 6:");

            Integer[] numbers = new Integer[5];
            numbers[0] = 9;
            numbers[1] = 1;
            numbers[2] = 20;
            numbers[3] = 2;
            numbers[4] = 7;


                int max = numbers[0];
                for ( Integer j = 0; j < numbers.length; j++) {
                    if (numbers[j] > max) {
                        max = numbers[j];
                    }
                }
                System.out.println("The maximum value in the array is: " + max);

                int min = numbers[0];
                for (Integer j = 0; j < numbers.length; j++) {
                    if (numbers[j] < min) {
                        min = numbers[j];
                    }
                }
                System.out.println("The minimum value in the array is: " + min);



        }
    }











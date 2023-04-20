package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       /*
        String[] cities = new String[5];
        cities[0]="Warsaw";
        cities[1]="Rome";
        cities[2]="Paris";
        cities[3]="Barcelona";
        cities[4]="Berlin";

        System.out.println("Zadanie 2,podpunkt pierwszy");
        for (Integer i=0; i<cities.length; i++){
            String city = cities[i];
            System.out.println(city);}

        System.out.println("Zadanie 2,podpunkt drugi");
        for (Integer i=cities.length-1; i>=0; i--){
            String city1 = cities[i];
            System.out.println(city1);}

        System.out.println("Zadanie 2,podpunkt trzeci");
        for (Integer i=0; i<cities.length; i+=2){
            String city2 = cities[i];
            System.out.println(city2);}

        */


        System.out.println("Zadanie 3");

        Double[] number = new Double[4];
        number[0] =1.5;
        number[1] =2.5;
        number[2] =3.5;
        number[3] =4.5;

        System.out.println("SUM of all numbers in table");

        Double suma = 0.0;
        int iloscLiczb = number.length;

        for (int i=0; i< number.length; i++){
            suma = suma + number[i];

        }
        System.out.println(suma);

        Double average = suma/number.length;

        System.out.println(average);

        /*
        //Zadanie 4

        String[] names = new String[7];
        names[0] = "Jan";
        names[1] = "Piotr";
        names[2] = "Jan";
        names[3] = "Karol";
        names[4] = "Wojciech";
        names[5] = "Jan";
        names[6] = "Jan";

        int liczbaImion = 0;
        for (Integer i = 0; i < names.length; i++) {
            String imie = names[i];
            if (imie == "Jan") {
                liczbaImion++;
            }
        }

        System.out.println("Liczba imion Jan w tablicy wynosi: " + liczbaImion);


         */

        /*
        //Zadanie 5

        String[] names = new String[7];
        names[0] = "Tomasz";
        names[1] = "Piotr";
        names[2] = "Jan";
        names[3] = "Karol";
        names[4] = "Wojciech";
        names[5] = "Michal";
        names[6] = "Adam";

        int liczbaImion = 0;
        for (Integer i = 0; i < names.length; i++) {
            String imie = names[i];
            if (imie == "Jan") {
                System.out.println("Imie Jan w tablicy wynosi ma numer: " + i);
            }

         */
        //Zadanie 6
        Integer[] numbers = new Integer[5];
        numbers[0] =9;
        numbers[1] =1;
        numbers[2] =20;
        numbers[3] =2;
        numbers[4] =7;

         {
            int max = numbers[0];
             for (Integer i = 0; i < numbers.length; i++){
             if (numbers[i] > max) {
                 max = numbers[i];
             }
         }
         System.out.println("Maksymalna wartość w tablicy to: " + max);

             int min = numbers[0];
             for (Integer i = 0; i < numbers.length; i++){
                 if (numbers[i] < min) {
                     min = numbers[i];
                 }
             }
             System.out.println("Minimalna wartość w tablicy to: " + min);



    }



    }


}










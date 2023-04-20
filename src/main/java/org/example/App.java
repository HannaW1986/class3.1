package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
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

        Float[] number = new Float[4];
        number[0] =1.5f;
        number[1] =2.5f;
        number[2] =3.5f;
        number[3] =4.5f;

        System.out.println("SUM of all numbers in table");

        Float suma = 0f;

        for (Float i=0f; i< number.length; i++){
            suma = suma + number[i];

        }
        System.out.println(suma);

        Float average = suma/number.length;

        System.out.println(average);









        }






    }


package org.example;

import java.util.List;
import java.util.Scanner;

public class ClothesShopApp
{
    public static void main (String[] args) throws Exception
    {
        ClothesShop clothesShop = new ClothesShop();
        Scanner scanner = new Scanner(System.in);

        boolean runningCondition = true;

        while (runningCondition)
        {
            System.out.println("Hello in our shop! Write a right number to be able to perform the relevant operations:");
            System.out.println("1-To add clothes");
            System.out.println("2-To remove clothes");
            System.out.println("3-Display clothes list");
            System.out.println("4-Exit the program");
            System.out.print("Choose the number:  ");

            String choice;
            choice = scanner.nextLine();
            if (!((choice.equalsIgnoreCase("1")) || (choice.equalsIgnoreCase("2")) || (choice.equalsIgnoreCase("3")) || (choice.equalsIgnoreCase("4")))) {
                System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
                continue;
            }


            switch (choice)
            {
                case "1" ->
                {
                    System.out.print("Specify gender: ");
                    String gender = scanner.nextLine();

                    System.out.print("Specify clothes' type: ");
                    String type = scanner.nextLine();

                    System.out.print("Specify brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Specify size: ");
                    String size = scanner.nextLine();

                    System.out.print("Write clothes' name: ");
                    String name = scanner.nextLine();

                    Clothes clothes = new Clothes(gender, type, brand, size, name);
                    clothesShop.addClothes(clothes);
                    System.out.println("Clothes added");
                }

                case "2" ->
                {
                    System.out.println("Which clothes you want to remove: ");
                    String name = scanner.nextLine();
                    boolean removed = false;
                    List<Clothes> clothesList = clothesShop.getClothesList();
                    for (Clothes clothes : clothesList)
                    {
                        if (clothes.getName().equalsIgnoreCase(name))
                        {
                            clothesShop.removeClothes(clothes);
                            removed = true;
                            System.out.print(clothes.getName() + " was removed");
                            break;
                        }
                    }
                }
                case "3" ->
                {
                    List<Clothes> clothesList = clothesShop.getClothesList();
                    for (Clothes clothes: clothesList)
                    {
                        System.out.println(clothes.getName());
                    }
                }
                case "4" -> runningCondition = false;

                default -> throw new Exception("Unsupported argument");
            }
        }

        scanner.close();
    }
}

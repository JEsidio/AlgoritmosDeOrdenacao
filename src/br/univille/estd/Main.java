package br.univille.estd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        /*Scanner input = new Scanner(System.in);

        //File file = new File(input.nextLine());
        File file = new File("src\\arquivos\\numeros_100000.txt");

        input = new Scanner(file);

        Double[] lista = new Double[100000];

        int i = 0;
        while (input.hasNextLine()) {
            double line = Double.parseDouble(input.nextLine());
            lista[i] = line;
            i++;
        }

        BubbleSort bubbleSortAsc = new BubbleSort<Double>(
                lista,
                new CompararNumeroAsc()
        );
        bubbleSortAsc.imprimir();*/





/*
    //##QUICK SORT CRESCENTE##
        Scanner input = new Scanner(System.in);
        File file = new File("src\\arquivos\\numeros_100000.txt");
        input = new Scanner(file);
        Double[] lista = new Double[100000];
        int i = 0;
        while (input.hasNextLine()) {
            double line = Double.parseDouble(input.nextLine());
            lista[i] = line;
            i++;
        }
        QuickSort quickSortAsc = new QuickSort(
                lista,
                new CompararNumeroAsc()
        );
        quickSortAsc.imprimir();
*/



/*
    //##QUICK SORT DECRESCENTE##
        Scanner input = new Scanner(System.in);
        File file = new File("src\\arquivos\\numeros_100000.txt");
        input = new Scanner(file);
        Double[] lista = new Double[100000];
        int i = 0;
        while (input.hasNextLine()) {
            double line = Double.parseDouble(input.nextLine());
            lista[i] = line;
            i++;
        }
        QuickSort quickSortAsc = new QuickSort(
                lista,
                new CompararNumeroDesc()
        );
        quickSortAsc.imprimir();
*/




/*
    //##SELECTION SORT DECRESCENTE##
        Scanner input = new Scanner(System.in);
        File file = new File("src\\arquivos\\numeros_100000.txt");
        input = new Scanner(file);
        Double[] lista = new Double[100000];
        int i = 0;
        while (input.hasNextLine()) {
            double line = Double.parseDouble(input.nextLine());
            lista[i] = line;
            i++;
        }
        SelectionSort selectionSort = new SelectionSort(
                lista,
                new CompararNumeroAsc()
        );
        selectionSort.imprimir();
*/





    }
}

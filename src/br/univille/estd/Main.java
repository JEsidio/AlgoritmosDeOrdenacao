package br.univille.estd;

import java.io.FileNotFoundException;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {

    	
    	LerArquivo lerArq = new LerArquivo();
    	Double[] lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
    	Double[] lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
    	String[] lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
    	String[] lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	LatitudeLongitude[] lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	LatitudeLongitude[] lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	
    	/*
    //##BUBBLE SORT CRESCENTE - LISTA 1##  
    	System.out.println("Bubble Num Asc Lista 1");
        BubbleSort bubbleSortAsc = new BubbleSort<Double>(lista1, new CompararNumeroAsc());
        bubbleSortAsc.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 1##
        System.out.println("Bubble Num Desc Lista 1");
        BubbleSort bubbleSortDesc = new BubbleSort<Double>(lista1, new CompararNumeroDesc());
        bubbleSortDesc.imprimir(false);

    //##BUBBLE SORT CRESCENTE - LISTA 2##  
        System.out.println("Bubble Num Asc Lista 2");
        BubbleSort bubbleSortAsc2 = new BubbleSort<Double>(lista2, new CompararNumeroAsc());
        bubbleSortAsc2.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 2##    
        System.out.println("Bubble Num Desc Lista 2");
        BubbleSort bubbleSortDesc3 = new BubbleSort<Double>(lista2, new CompararNumeroDesc());
        bubbleSortDesc3.imprimir(false);
    	
    //##BUBBLE SORT CRESCENTE - LISTA 3##  
        System.out.println("Bubble String Asc Lista 3");
        BubbleSort bubbleSortAsc4 = new BubbleSort<String>(lista3, new CompararStringAsc());
        bubbleSortAsc4.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 3##    
        System.out.println("Bubble String Desc Lista 3");
        BubbleSort bubbleSortDesc5 = new BubbleSort<String>(lista3, new CompararStringDesc());
        bubbleSortDesc5.imprimir(false);
    	
    //##BUBBLE SORT CRESCENTE - LISTA 4##    
        System.out.println("Bubble String Asc Lista 4");
        BubbleSort bubbleSortAsc6 = new BubbleSort<String>(lista4, new CompararStringAsc());
        bubbleSortAsc6.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 4##    
        System.out.println("Bubble String Desc Lista 4");
        BubbleSort bubbleSortDesc7 = new BubbleSort<String>(lista4, new CompararStringDesc());
        bubbleSortDesc7.imprimir(false);
    	
    //##BUBBLE SORT CRESCENTE - LISTA 5##    
        System.out.println("Bubble Objeto Asc Lista 5");
        BubbleSort bubbleSortAsc8 = new BubbleSort<LatitudeLongitude>(lista5, new CompararObjetoAsc());
        bubbleSortAsc8.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 5##    
        System.out.println("Bubble Objeto Desc Lista 5");
        BubbleSort bubbleSortDesc9 = new BubbleSort<LatitudeLongitude>(lista5, new CompararObjetoDesc());
        bubbleSortDesc9.imprimir(false);
    	
    	//##BUBBLE SORT CRESCENTE - LISTA 6##  
        System.out.println("Bubble Objeto Asc Lista 6");
        BubbleSort bubbleSortAsc10 = new BubbleSort<LatitudeLongitude>(lista6, new CompararObjetoAsc());
        bubbleSortAsc10.imprimir(false);

    //##BUBBLE SORT DECRESCENTE - LISTA 6##    
        System.out.println("Bubble Objeto Desc Lista 6");
        BubbleSort bubbleSortDesc11 = new BubbleSort<LatitudeLongitude>(lista6, new CompararObjetoDesc());
        bubbleSortDesc11.imprimir(false);
    	*/
    	/*

    //##QUICK SORT CRESCENTE - LISTA 1##   
    	lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        QuickSort quickSortAsc = new QuickSort(lista1, new CompararNumeroAsc());
        quickSortAsc.imprimir(false);

    //##QUICK SORT DECRESCENTE - LISTA 1##
        lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        QuickSort quickSortDesc = new QuickSort(lista1, new CompararNumeroDesc());
        quickSortDesc.imprimir(false);
               
    //##QUICK SORT CRESCENTE - LISTA 2##  
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        quickSortAsc = new QuickSort(lista2, new CompararNumeroAsc());
        quickSortAsc.imprimir(false);

    //##QUICK SORT DECRESCENTE - LISTA 2##
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        quickSortDesc = new QuickSort(lista2, new CompararNumeroDesc());
        quickSortDesc.imprimir(false);
    	    	
    //##QUICK SORT CRESCENTE - LISTA 3##
       lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
       quickSortAsc = new QuickSort(lista3, new CompararStringAsc());
       quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 3##
    	lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
    	quickSortDesc = new QuickSort(lista3, new CompararStringDesc());
    	quickSortDesc.imprimir(false);
    	
    //##QUICK SORT CRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	quickSortAsc = new QuickSort(lista4, new CompararStringAsc());
    	quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	quickSortDesc = new QuickSort(lista4, new CompararStringDesc());
    	quickSortDesc.imprimir(false);
    	
    //##QUICK SORT CRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	quickSortAsc = new QuickSort(lista5, new CompararObjetoAsc());
    	quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	quickSortDesc = new QuickSort(lista5, new CompararObjetoDesc());
    	quickSortDesc.imprimir(false);
    	
    //##QUICK SORT CRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	quickSortAsc = new QuickSort(lista6, new CompararObjetoAsc());
    	quickSortAsc.imprimir(false);
    	
    //##QUICK SORT DECRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	quickSortDesc = new QuickSort(lista6, new CompararObjetoDesc());
    	quickSortDesc.imprimir(false);	
    	
    	
    	*/
    	
    	
    	
    	
    	
    	
    	

    	
    //##INSERT SORT CRESCENTE - LISTA 1##
    	//InsertSort insertSortAsc = new InsertSort(lista1, new CompararNumeroAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 1##
    	//InsertSort insertSortDesc = new InsertSort(lista1, new CompararNumeroDesc());
        //insertSortDesc.imprimir(false);
    
    //##INSERT SORT CRESCENTE - LISTA 2##
    	//InsertSort insertSortAsc = new InsertSort(lista2, new CompararNumeroAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 2##
    	//InsertSort insertSortDesc = new InsertSort(lista2, new CompararNumeroDesc());
        //insertSortDesc.imprimir(false);
    	
    //##INSERT SORT CRESCENTE - LISTA 3##
    	//InsertSort insertSortAsc = new InsertSort(lista3, new CompararStringAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 3##
    	//InsertSort insertSortDesc = new InsertSort(lista3, new CompararStringDesc());
        //insertSortDesc.imprimir(false);
    
    //##INSERT SORT CRESCENTE - LISTA 4##
    	//InsertSort insertSortAsc = new InsertSort(lista4, new CompararStringAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 4##
    	//InsertSort insertSortDesc = new InsertSort(lista4, new CompararStringDesc());
        //insertSortDesc.imprimir(false);
    	
    //##INSERT SORT CRESCENTE - LISTA 5##
    	//InsertSort insertSortAsc = new InsertSort(lista5, new CompararObjetoAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 5##
    	//InsertSort insertSortDesc = new InsertSort(lista5, new CompararObjetoDesc());
        //insertSortDesc.imprimir(false);
    	
    //##INSERT SORT CRESCENTE - LISTA 6##
    	//InsertSort insertSortAsc = new InsertSort(lista6, new CompararObjetoAsc());
        //insertSortAsc.imprimir(false);

    //##INSERT SORT DECRESCENTE - LISTA 6##
    	//InsertSort insertSortDesc = new InsertSort(lista6, new CompararObjetoDesc());
        //insertSortDesc.imprimir(false);
    	
    	
    	
    	
    	
    //##SELECTION SORT CRESCENTE - LISTA 1##
    	//lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
    	//SelectionSort selectionSortAsc = new SelectionSort(lista1, new CompararNumeroAsc());
    	//selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 1##
    	//lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
    	//SelectionSort selectionSortDesc = new SelectionSort(lista1, new CompararNumeroDesc());
    	//selectionSortDesc.imprimir(false);
        
    //##SELECTION SORT CRESCENTE - LISTA 2##
    	//lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
    	//selectionSortAsc = new SelectionSort(lista2, new CompararNumeroAsc());
    	//selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 2##
        //lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        //selectionSortDesc = new SelectionSort(lista2, new CompararNumeroDesc());
        //selectionSortDesc.imprimir(false);

    //##SELECTION SORT CRESCENTE - LISTA 3##
        //lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
        //selectionSortAsc = new SelectionSort(lista3, new CompararStringAsc());
        //selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 3##
        //lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
        //selectionSortDesc = new SelectionSort(lista3, new CompararStringDesc());
        //selectionSortDesc.imprimir(false);
    	
    //##SELECTION SORT CRESCENTE - LISTA 4##
        //lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
        //selectionSortAsc = new SelectionSort(lista4, new CompararStringAsc());
        //selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 4##
        //lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
        //selectionSortDesc = new SelectionSort(lista4, new CompararStringDesc());
        //selectionSortDesc.imprimir(false);
    	
    //##SELECTION SORT CRESCENTE - LISTA 5##
        //lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
        //selectionSortAsc = new SelectionSort(lista5, new CompararObjetoAsc());
        //selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 5##
        //lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
        //selectionSortDesc = new SelectionSort(lista5, new CompararObjetoDesc());
        //selectionSortDesc.imprimir(false);

    //##SELECTION SORT CRESCENTE - LISTA 6##
        //lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
        //selectionSortAsc = new SelectionSort(lista6, new CompararObjetoAsc());
        //selectionSortAsc.imprimir(false);
        
    //##SELECTION SORT DECRESCENTE - LISTA 6##
        //lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
        //selectionSortDesc = new SelectionSort(lista6, new CompararObjetoDesc());
        //selectionSortDesc.imprimir(false);


    	
    	/*
    	

    	
    //##MERGE SORT CRESCENTE - LISTA 1##      
    	lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        MergeSort mergeSortAsc = new MergeSort(lista1, new CompararNumeroAsc());
        mergeSortAsc.imprimir(false);

    //##MERGE SORT DECRESCENTE - LISTA 1##
        lista1 = lerArq.importaDouble("src\\arquivos\\numeros_100000.txt", 100000);
        MergeSort mergeSortDesc = new MergeSort(lista1, new CompararNumeroDesc());
        mergeSortDesc.imprimir(false);
               
    //##MERGE SORT CRESCENTE - LISTA 2##   
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
         mergeSortAsc = new MergeSort(lista2, new CompararNumeroAsc());
        mergeSortAsc.imprimir(false);

    //##MERGE SORT DECRESCENTE - LISTA 2##
        lista2 = lerArq.importaDouble("src\\arquivos\\numeros_1000000.txt", 1000000);
        mergeSortDesc = new MergeSort(lista2, new CompararNumeroDesc());
        mergeSortDesc.imprimir(false);
    	    	
    //##MERGE SORT CRESCENTE - LISTA 3##
        lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
        mergeSortAsc = new MergeSort(lista3, new CompararStringAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 3##
    	lista3 = lerArq.importaString("src\\arquivos\\palavras_100000.txt", 100000);
    	mergeSortDesc = new MergeSort(lista3, new CompararStringDesc());
    	mergeSortDesc.imprimir(false);
    	
    //##MERGE SORT CRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	mergeSortAsc = new MergeSort(lista4, new CompararStringAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 4##
    	lista4 = lerArq.importaString("src\\arquivos\\palavras_1000000.txt", 1000000);
    	mergeSortDesc = new MergeSort(lista4, new CompararStringDesc());
    	mergeSortDesc.imprimir(false);
    	
    //##MERGE SORT CRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	mergeSortAsc = new MergeSort(lista5, new CompararObjetoAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 5##
    	lista5 = lerArq.importaArq("src\\arquivos\\objetos_100000.txt", 100000);
    	mergeSortDesc = new MergeSort(lista5, new CompararObjetoDesc());
    	mergeSortDesc.imprimir(false);
        
    //##MERGE SORT CRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	mergeSortAsc = new MergeSort(lista6, new CompararObjetoAsc());
    	mergeSortAsc.imprimir(false);
    	
    //##MERGE SORT DECRESCENTE - LISTA 6##
    	lista6 = lerArq.importaArq("src\\arquivos\\objetos_1000000.txt", 1000000);
    	mergeSortDesc = new MergeSort(lista6, new CompararObjetoDesc());
    	mergeSortDesc.imprimir(false);

*/
    }
}

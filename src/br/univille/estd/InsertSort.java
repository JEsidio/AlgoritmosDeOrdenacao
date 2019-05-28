package br.univille.estd;

public class InsertSort<T> {

    private T[] objeto;
    private Comparar<T> comparar;

    public InsertSort(T[] objeto, Comparar<T> comparar){
        this.objeto = objeto;
        this.comparar = comparar;
    }

    public T[] ordenar(){
        for (int i = 0; i < this.objeto.length; i++){
            T aux = this.objeto[i];
            int j = i - 1;

            while (j >= 0 && comparar.compareTo(aux, this.objeto[j]) < 0){
                this.objeto[j + 1] = this.objeto[j];
                j = j - 1;
            }

            this.objeto[j + 1] = aux;

        }

        return this.objeto;

    }


    public void imprimir(){
        System.out.println("Insert Sort:");
        for (int i = 0; i < ordenar().length; i++){
            System.out.print(i > 0 ? ", ": "");
            System.out.print(ordenar()[i]);
        }
    }

}

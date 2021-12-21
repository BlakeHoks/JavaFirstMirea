package ru.mirea.task12;

public class SortingStudentsByGPA implements Comparable {
    @Override
    public void quickSort(int[] array, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int temp = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker] > temp) {
                leftMarker++;
            }
            while (array[rightMarker] < temp) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int buf = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = buf;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right) {
            quickSort(array, leftMarker, right);
        }
        if (left < rightMarker) {
            quickSort(array, left, rightMarker);
        }
    }
    public static void main(String[] args) {
        int[] grades=new int[30];
        for(int i = 0; i < 20; i++){
            grades[i]=(int)(Math.random()*100);
        }
        System.out.println("Entered values");
        for(int i = 0; i < 20; i++){
            System.out.print(grades[i]+" ");
        }
        System.out.println();
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        s.quickSort(grades,0,20);
        System.out.println("Sorted values");
        for(int i = 0; i < 20; i++) System.out.print(grades[i]+" ");

    }


}
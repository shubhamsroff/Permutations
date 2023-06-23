/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package noofpermutation;

public class NoOfPermutation {

    public static void getPrint(String strName) {
        char array[] = strName.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] == array[j]) {
                        array[j] = '-';
                    }
                }
            }

        }
        String newString = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '-') {
                newString += array[i];
            }
        }
        System.out.println(newString);
        char sortedArray[] = newString.toCharArray();
        char doubleArray[][] = new char[sortedArray.length][2];
        char oldArray[] = strName.toCharArray();
        count = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < oldArray.length; j++) {
                if (sortedArray[i] == oldArray[j]) {
                    count++;
                }
            }
            doubleArray[i][0] = sortedArray[i];
            doubleArray[i][1] = (char) count;
            count = 0;
        }
        int denominator = 1;
        int total=0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = (int) doubleArray[i][1]; j >= 1; j--) {
                if (j >= 2) {
                    denominator = denominator * j;
                }
            }
            System.out.println(doubleArray[i][0]+" "+(int)doubleArray[i][1]);
           
        }
        System.out.println(denominator+" is ");
        int fact = 1;
        for (int i = oldArray.length; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        System.out.println("Permutations" + fact / denominator);
    }
    public static void main(String[] args) {
        getPrint("india");
    }

}

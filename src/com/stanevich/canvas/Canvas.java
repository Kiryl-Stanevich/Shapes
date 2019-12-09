package com.stanevich.canvas;

public class Canvas {

    public static void main(String[] args)
    {
        char[] array1;
        char[][] array2;

    }

    public Canvas(char[] array1, char[][] array2)
    {
        array1 = new char[5];
        array2 = new char[5][5];
    }

    public void fillWithDash()
    {
        char [] array1;
        array1 = new char [5];
        for (int i=0; i<array1.length; i++)
        {
        array1[i] = '-';
        }
    }

    public void fillWithAsteriks()
    {
        char [][] array2;
        array2 = new char [5][5];
        for (int i=0; i<array2.length; i++)
        {
            for (int j=0; i<array2[i].length; j++)
            {
                array2[i][j] = '*';
            }
        }
    }


    public void printLine(char[] array1)
    {
        System.out.print(array1[5]);
    }

    public void printCanvas(char[][] array2)
    {
        System.out.print(array2[5][5]);
    }

}

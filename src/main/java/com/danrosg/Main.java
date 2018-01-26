package com.danrosg;

import java.util.ArrayList;

public class Main {




        public static ArrayList<String> mergeStrings(String[] array, String[] more) {
            ArrayList<String> merged = new ArrayList<String>();
            for (String s : array) {
                merged.add(s);
            }

            for (String s : more)
                merged.add(s);

            return merged;
        }

        public static boolean hasUniqueChars(String input)
        {
            if(input.length()>128)
                return false;

            boolean[] map =new boolean[128];

            for (int i=0;i<input.length();i++) {

                if(map[input.charAt(i)])
                    return false;
                else
                    map[input.charAt(i)]=true;

            }

            return true;
        }

        public static boolean isPermutation(String arg1, String arg2)
        {
            int[] chars =new int[128];

            if(arg1.length()!=arg2.length())
                return false;

            for(int i=0; i< arg1.length();i++)
                chars[arg1.charAt(i)]++;
            for(int i=0;i<arg2.length();i++)
            {
                if(--chars[arg2.charAt(i)] <0)
                    return false;
            }

            return true;
        }


       public static int[][] rotateMatrix90(int [][] input)
       {

           if(input.length!=input[0].length || input.equals(null))
               return null;

           int temp;
           int [][] output = new int[input.length][input.length];

           for(int i=0;i<input.length;i++)
               for(int j=0; j<input.length;j++)

                   output[j][output.length-i-1]=input[i][j];

           return  output;
       }


    public static void printMatrix(int [][] input)
    {

        for(int i=0;i<input.length;i++){


            for(int j=0; j<input[0].length;j++)
                System.out.print(input[i][j]+" ");

            System.out.println("");
        }

    }
    public static void main(String[] args) {


        String[] array1={"HI","There"};
        String[] array2={"a","ab"};

        //System.out.println(Main.mergeStrings(array1,array2));
        System.out.println(Main.hasUniqueChars("aabcde"));

        int i=5;

        System.out.println(Main.isPermutation("asdadc","dscdaa"));


        int [][] test1 =                {{1,2,3,4,5},
                                        {6,7,8,9,10},
                                        {11,12,13,14,15},
                                        {16,17,18,19,20},
                                        {21,22,23,24,25} };

        Main.printMatrix(test1);
        Main.printMatrix(rotateMatrix90(test1));
        }



}

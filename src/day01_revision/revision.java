package day01_revision;

public class revision {
    public static void main(String[] args) {

        System.out.println((int)(7.9)+(int)(6.7));//13
        System.out.println((int)(7.9+6.7));//14
        System.out.println((double)(17));//17.0
        System.out.println((double)(8+3));//11.0
        System.out.println((double)(7)/2);//3.5
        System.out.println((double)(7/2));//3.0
        System.out.println((int)(7.8+(double)(15)/2));//15
//===============================================
        System.out.println(5+2*4);//13
        System.out.println(10/2-3);//2
        System.out.println(8+12*2-4);//28
        System.out.println(4+17%2-1);//4
        System.out.println(6-3*2+7-1);//6
        System.out.println((5+2)*4);//28
        System.out.println(10/(5-3));//5
        System.out.println(8+12*(6-2));//56
        System.out.println((4+17)%(2+7)/3);//1
//===============================================
        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);//12
        System.out.println(x);//5
//===============================================
        int i = 11, j = 4;
        int res = i++ + --j;
        System.out.println("res = " + res);//14
// ==============================================
        int a=50;
        int res3= --a + a++ + a-- + a++;
/*
        a in memory ⇒ 50 → 49 → 50 → 49 → 50
        result ⇒           49 + 49 + 50 + 49 = 197
*/
        System.out.println("a = " + a);//50
        System.out.println("res = " + res3);//197
//=============================================
        System.out.println (1 + 25 + 2 + "aws"); //28aws
        System.out.println(1 + "aws" + (2 + 4)); //1aws6
        System.out.println("aws" + 1 + 2 + 3); //aws123
        System.out.println('a' + 'w' + 's'); //number
        System.out.println('w' + " " + 's'); //w s
        System.out.println('a' + "" + 's'); //a s
        System.out.println('w' + 's'); //number
        System.out.println('w');//w



    }
}

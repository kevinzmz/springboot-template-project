package com.base.test;

/**
 * <P></P>
 * Created by kevin on 2017/8/7 10:55.
 */
public class TestArray {
    public void testMultiRangeArray() {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public void testArrayLength() {
        int[][][] a = new int[5][8][3];
        System.out.println(a[1].length);
        System.out.println(a[1][1].length);
    }


    public boolean testArrayRangeSafe(int[][][] a, int[][][] b) {
        return false;
    }

    public void testNumberString(){
        int m = 2;
        int n = 2;
        int a = 4;
        int b = 15;


        System.out.println(Integer.parseInt("1111",2));

        System.out.println(Integer.toBinaryString(a)+Integer.toBinaryString(b));
        int z = Integer.parseInt(Integer.toBinaryString(a)+Integer.toBinaryString(b),2);
        System.out.println(Integer.toBinaryString(m)+(String.format("%0"+(Integer.toBinaryString(b).length()-Integer.toBinaryString(n).length())+"d",0)+Integer.toBinaryString(n)));
        int s = Integer.parseInt(Integer.toBinaryString(m)+(String.format("%0"+(Integer.toBinaryString(b).length()-Integer.toBinaryString(n).length())+"d",0)+Integer.toBinaryString(n)),2);

        System.out.println("-------------------"+z+"--------------");
        System.out.println("+++++++++++++++++++"+s+"++++++++++++++");

        System.out.println(Integer.parseInt(Integer.toBinaryString(a)+Integer.toBinaryString(b),2)-Integer.parseInt(Integer.toBinaryString(m)+String.format("%0"+(Integer.toBinaryString(b).length()-Integer.toBinaryString(n).length())+"d",0)+Integer.toBinaryString(n),2));
    }

    public static void main(String[] args) {
        TestArray testArray = new TestArray();
        testArray.testNumberString();
    }

}

package org.example;

public class NumberProblems {

    public static int reverseANumber(int no){
        //1234
        // 1234 % 10 = 4*1000, 123%10 = 3*100, ...
        // rem = 4
        int reverseNo = 0;
        while(no!=0){
            int rem = no%10;
            reverseNo = reverseNo*10+rem;
            no = no/10;
        }
        System.out.println(reverseNo);
        return reverseNo;
    }

    public static int wrongApproach(int no){
        int copy = no;
        if (no < 0) {

            throw new RuntimeException("Incorrect no");
        }
        int reverseNo=-1;
        int multiplier = 1;
        while(copy >= 10){
            multiplier = multiplier*10;
            copy=copy/10;
        }
        copy = no;
        while(copy>=10){
            multiplier = multiplier/10;
            int rem = copy%10;
            reverseNo+= multiplier*rem;
            copy = copy/10;
        }
        reverseNo += copy;

        System.out.println(reverseNo);
        return reverseNo;
    }

    public static int armStrongNo(int no){
        // 153 1pow3+5pow3+3pow3
        //9474 9pow4+4pow4+ 7pow4+ 4 pow4
        int count = 0;
        int copy = no;
        while(copy>0){
            copy = copy/10;
            count++;
        }
        copy = no;
        int armStrongNo = 0;
        while(copy>0){
            int rem = copy%10;
            double pow = Math.pow(rem, count);
            armStrongNo+= (int) pow;
            copy = copy/10;
        }
        System.out.println(armStrongNo);
        return armStrongNo;
    }
}

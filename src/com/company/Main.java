package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(-12);
    }

    public static void numberToWords(int num){
        if (num < 1){
            System.out.println("invalid number");
        }

        int reversed = reverse(num);
        int savedReversed = reversed;
        while (reversed > 0){
            int digit = reversed % 10;
            reversed /= 10;

            switch (digit){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;

            }
        }
        if (getDigitCount(savedReversed) != getDigitCount(num)){
            for (int i = getDigitCount(savedReversed); i < getDigitCount(num); i++){
                System.out.println("zero");
            }
        }
        System.out.println(" ");
    }

    public static int reverse (int reverseThisNum){
       if (reverseThisNum < 10 && reverseThisNum > -10){
           return reverseThisNum;
       }

        int reverseNum = 0;
        int digit = 0;
        while (reverseThisNum > 0){
            reverseNum *= 10;
            digit = reverseThisNum % 10;
            reverseNum += digit;
            reverseThisNum /= 10;
        }
        return reverseNum;

    }

    public static int getDigitCount (int numDigits){
        int digitCount = 0;

        while (numDigits > 0){
            digitCount++;
            numDigits /=10;
        }
        return digitCount;
    }
}

//this was my solution, not any Buchalka or Buchalka students.
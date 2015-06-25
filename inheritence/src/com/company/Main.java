package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Number n;
        Integer i; // Integer inherit from Number...
        Number num = new Integer(8);
        //Number n1 = new Number();  // error Number is a general class cant create obj from
        Number[] nums = new Number[5];
        nums[0]= new Byte((byte)10);
        nums[1]= new Integer(10);
        nums[2] = new Float(10.0f);
        nums[3] = new Double(10.0);
        nums[4] = new Fraction(2,4); // function doubleValue in Fraction return 0.5!!!
        System.out.println(sum(nums));
        Fraction f = new Fraction(2,4);
        System.out.println(f);
        System.out.println(f.doubleValue());
        System.out.println(Integer.valueOf("0001120"));
    }
    public static double sum(Number[] nums){
        //get array return sum in type double
        double sum = 0;
        //for each .........
        for (Number n : nums){
            sum += n.doubleValue();
        }
        return sum;
        /*
        for (int i = 0; i < nums.length; i++) {
            //sum += nums[i].doubleValue();
            Number n = nums[i];
            sum += n.doubleValue();
        }
        return sum;
        */
    }


}

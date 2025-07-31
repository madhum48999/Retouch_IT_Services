package JavaBasicFundamentals;

public class AirthematicOperation {
    public static void main(String[] args) {
        int num = 7;
        int num1 = 5    ;

        //a. performing addition operation
        int add = num+num1;
        System.out.println(num+"+"+num1+" = "+add);

        //b. performing substraction operation
        int sub = num-num1;
        System.out.println(num+"-"+num1+" = "+sub);

        //c. performing mutiplication operation
        int multiply = num*num1;
        System.out.println(num+"*"+num1+" = "+multiply);

        //d. performing division operation
        int div = num/num1;
        System.out.println(num+"/"+num1+" = "+div);

        //Increment
       // num1=num1+1;
        //System.out.println(num1);

        //num1=num1+2;
        //System.out.println(num1);

        //pre Increment
        ++num;
        System.out.println(num);

        //Post-increment
        num1++;
        System.out.println(num1);

        int result = ++num1;
        int result1 = num1++;
        int result2 = --num1;
        int result3 = num1--;


    }
}

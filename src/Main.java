import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many random passwords do you want to generate?");
        int total=sc.nextInt();
        System.out.println("How many characters long do you need your password??");
        int length=sc.nextInt();
        //stores all random passwords
        String []randomPasswords = new String[total];
        //loop through total no of passwords
        for(int i=0;i<total;i++){
           //generate one random password
            String randomPassword="";
            for(int j=0;j<length;j++){
                //generate one random character
                randomPassword += randomCharacter();
            }
            //add all passwords to the array
            randomPasswords[i]=randomPassword;
        }
        //print the array
        printPassword(randomPasswords);
        System.out.println( passwordTesting(length));
    }
    public static void printPassword(String []arr){
        for(int o=0;o< arr.length;o++){
            System.out.println(arr[o]);
        }
    }
    public static String passwordTesting(int l){
        if (l<5){
            return "Weak Password";
        }
        else if(l<10) {
            return "Medium Password";
        }
        else{
            return  "Strong Password";
        }
     //   return "null";
    }

    public static char randomCharacter(){
      //10 numbers =26 uppercase letters and 26 lowercase letters as ASCII values
        int rand=(int)(Math.random()*62);
        //break rand into intervals to represent numbers, uppercase and lowercase letters
        if(rand<=9){
            //number rand is btwn 0-9 so to convert as ascii is 48-57
           int ascii=rand+48;
           return (char)(ascii);
        }
        else if (rand<=35){
           // number rand is btwn 10-35 so to convert as ascii is 65-99
            int ascii=rand+55;
            return (char) (ascii);
        }
        else if(rand<=61){
           //number rand is btwn 36-61 so to convert as ascii is 97-122
            int ascii=rand+61;
            return (char) (ascii);
        }
        return (char)(rand);
    }

}
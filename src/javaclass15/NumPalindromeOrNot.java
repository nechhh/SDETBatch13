package javaclass15;

public class NumPalindromeOrNot {
    void printIspalindrome(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if(str.equals(reversedStr)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}

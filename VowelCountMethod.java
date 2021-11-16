package VowelCountmethod;

import java.util.Scanner;

public class VowelCountMethod {
    public static void main(String[] args) {
        String str="";
        Scanner keyboard = new Scanner(System.in);
        
        
        while(!str.equalsIgnoreCase("stop")){
            System.out.print("Enter a string: ");
            str = keyboard.nextLine();
            System.out.println(str + "\t" + 
                    vowelCount(str));}
        
    }
    
    public static int vowelCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            switch(str.charAt(i)){
                case 'a': case 'A':
                case 'e': case 'E':
                case 'i': case 'I':
                case 'O': case 'o':
                case 'u': case 'U':
                    count++;
                    break;
                default:
                    ;
            }
        }
        return count;
    }
    
}

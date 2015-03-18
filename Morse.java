//Alexander Comerford
//Data Structures

import java.util.Scanner; //to be able to read from the keyboard
public class Morse {
  public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  String input_string;
  
  System.out.println("Type a String and I will convert it to morse code: ");
  System.out.println("I only account for alphanumeric,period, question mark, comma, and space\n>>>");
  input_string = input.nextLine();
  //convert string to morse code

  String output_string = toMorse(input_string);
  System.out.println("Morse String:\n"+output_string);
  }
  
  public static String toMorse(String temp){
    String morse_string = "";
    for(char i : temp.toCharArray()){
      i = Character.toUpperCase(i);
      if (i==' '){morse_string+=" ";}
      else if(i==','){morse_string+="--..--";}
      else if(i=='.'){morse_string+=".-.-.-";}
      else if(i=='?'){morse_string+="..--..";}
      else if(i=='0'){morse_string+="-----";}
      else if(i=='1'){morse_string+=".----";}
      else if(i=='2'){morse_string+="..---";}
      else if(i=='3'){morse_string+="...--";}
      else if(i=='4'){morse_string+="....-";}
      else if(i=='5'){morse_string+=".....";}
      else if(i=='6'){morse_string+="-....";}
      else if(i=='7'){morse_string+="--...";}
      else if(i=='8'){morse_string+="---..";}
      else if(i=='9'){morse_string+="----.";}
      else if(i=='A'){morse_string+=".-";}
      else if(i=='B'){morse_string+="-...";}
      else if(i=='C'){morse_string+="-.-.";}
      else if(i=='D'){morse_string+="-..";}
      else if(i=='E'){morse_string+=".";}
      else if(i=='F'){morse_string+="..-.";}
      else if(i=='G'){morse_string+="--.";}
      else if(i=='H'){morse_string+="....";}
      else if(i=='I'){morse_string+="..";}
      else if(i=='J'){morse_string+=".---";}
      else if(i=='K'){morse_string+="-.-";}
      else if(i=='L'){morse_string+=".-..";}
      else if(i=='M'){morse_string+="--";}
      else if(i=='N'){morse_string+="-.";}
      else if(i=='O'){morse_string+="---";}
      else if(i=='P'){morse_string+=".--.";}
      else if(i=='Q'){morse_string+="--.-";}
      else if(i=='R'){morse_string+=".-.";}
      else if(i=='S'){morse_string+="...";}
      else if(i=='T'){morse_string+="-";}
      else if(i=='U'){morse_string+="..-";}
      else if(i=='V'){morse_string+="...-";}
      else if(i=='W'){morse_string+=".--";}
      else if(i=='X'){morse_string+="-..-";}
      else if(i=='Y'){morse_string+="-.--";}
      else if(i=='Z'){morse_string+="--..";}
      else{morse_string+=" ";}
    }
    return(morse_string);  
    }
}

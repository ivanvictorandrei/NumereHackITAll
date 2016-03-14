package numere;
import java.lang.String;
import java.lang.Integer;
import java.lang.Character;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Numere {
    
    //Vectorii astia tin valorile numerelor.
    private final String[] v = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private final String[] v1 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private final String[] v2 = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
    //Stringul pe care se fac operatiile de afisare, practic cel in care citesti.
    private String numar;//bagam nr initial din tf
    private string output;// il folosim pentru output final
    
    public Numere(String s)
    {
        this.numar=s;
        this.output=new String("");
    }
    
    //Metoda privata de citire care returneaza integerul citit.
/*    private int read()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = keyboard.nextInt();
        if (i > 999999999){
            System.out.println("The number you have introduced is too big!");
            i = read();
        }
        if (i < 0){
            System.out.println("The number you have introduced is negative!");
            i = read();
        }
        return i;
    }
    */
    //Aici se foloseste metoda de citire si se face si trecerea de la int la string
    //Important, vom folosi pentru completarea cu numere
    /*
    public void toStr()
    {
        numar = Integer.toString(read());
        while(numar.length() % 3 != 0){
            numar = "0" + numar; //Se completeaza cu zerouri pana numarul de cifre e multiplu de 3.
        }
    }
    */
    
    //Metoda care face afisarea unei secvente de 3 cifre.
    public void printNo(String numar)
    {
        //toate verificarile posibile pentru a afisa ce trebuie
        //mi-e lene sa scriu la fiecare in parte, daca vrei ti le explic la telefon
        if(Character.getNumericValue(numar.charAt(0)) ==0 && Character.getNumericValue(numar.charAt(1)) == 0){
           output=output + v[Character.getNumericValue(numar.charAt(2))] + " ";
        }
        else{
        if(Character.getNumericValue(numar.charAt(0)) > 0){
            output = output + v[Character.getNumericValue(numar.charAt(0))] + " hundred ";
        }
        if(Character.getNumericValue(numar.charAt(1)) == 1){
            output = output + v1[Character.getNumericValue(numar.charAt(2))] + " ";
        }
        else if (Character.getNumericValue(numar.charAt(1)) > 1 && Character.getNumericValue(numar.charAt(2)) > 0){
            output = output + v2[Character.getNumericValue(numar.charAt(1)) - 2] + v[Character.getNumericValue(numar.charAt(2))] + " ";
        }
        else if(Character.getNumericValue(numar.charAt(2)) == 0 && Character.getNumericValue(numar.charAt(1)) > 1){
            output = output + v2[Character.getNumericValue(numar.charAt(1)) - 2] + " ";
        }
        if(Character.getNumericValue(numar.charAt(1)) == 0 && Character.getNumericValue(numar.charAt(2)) > 0){
            output = output + v[Character.getNumericValue(numar.charAt(2))] + " ";
        }
        }
    }
    
    //Metoda care afiseaza intreg numarul folosindu-se de metoda de mai sus.
    public void print()
    {
        int i = numar.length()/3;
        while( i != 0 ){
            String n = numar.substring(0,3);
            numar = numar.substring(3);
            printNo(n);
            if( i == 3){
                output= output + "million ";
            }
            else if( i == 2 ){
                output = output + "thousand ";
            }
            i--;
        }
    }
    
    //Main
    /*
    public static void main(String[] args) {
        Numere test = new Numere();
        test.toStr(); //Citirea si trecerea la String
        System.out.println();
        test.print(); //printul numerelor efectiv. Poti s-o incerci si tu sa vezi ca nu face figuri
                      //ararta ce trebuie de ficare data.
    }
    */
}

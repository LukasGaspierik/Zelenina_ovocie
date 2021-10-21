package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        String ovocie[]={"banan", "jablko", "jahoda"};
;       String zelenina[]={"mrkva", "kapusta","kalerab"};
        boolean running = true;
        Scanner sc = new Scanner(System.in);


        while(running){
            System.out.println("Zadaj lubovolne ovocie alebo zeleninu");
            String vstup = sc.nextLine();
            boolean is_zelenina = false;
            boolean is_ovocie = false;

            for (String item : ovocie){
                if (vstup.equals(item)){
                    is_ovocie = true;
                    break;

                }
            }
             for (String item : zelenina){
                 if (vstup.equals(item)){
                     is_zelenina = true ;
                     break;

                 }
             }

             if(is_ovocie)
                 System.out.println(vstup + " je ovocie");

             else if (is_zelenina)
                 System.out.println(vstup +" je zelenina" );

             else{
                 System.out.println("Zadal si niečo zle");
             }
        }

    }
}





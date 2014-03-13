package edu.macalester.comp124.stringtransformer;

import acm.util.RandomGenerator;

/**
 * Created by Reena on 2/27/14.
 */
public class Piratizer extends StringTransformer {

    @Override
    public String transform(String s) {

        String stringPirate = " ";

        for(int i= 0; i <= s.length(); i++){

           stringPirate += s.charAt(i);

           if (s.charAt(i) == 'r'){
               stringPirate += "rr";
           }

           RandomGenerator rgen = RandomGenerator.getInstance();
           int a = rgen.nextInt(1,8);

           if((a == 1) && (s.charAt(i) == '.') ){
               stringPirate += "Ahoy!";
           }

           if ((a == 2) && (s.charAt(i) == '.')){
               stringPirate += "Arrrrr!";

           }


        }


        return stringPirate;
    }


    @Override
    public String toString() {

        return "Pirate lang";
    }

}

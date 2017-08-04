package fr.soalculatrice;

import fr.sopra.shared.math.MathUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MathUtils mathUtils = new MathUtils();
    	
        System.out.println( "Factorielle de 7: " +mathUtils.factorielle(7) );
    }
}

package com.polytech;
import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cours c = new CoursBuilder().setEnseignant("enseignant").setMatiere("math").build();
        System.out.println(c.getMatiere());
    }
}

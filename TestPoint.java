/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class TestPoint{
public static void main (String args[])
  { Point a ;
    a = new Point(3, 5) ;
    System.out.println ("Je suis un point de coordonnees "
                        + a.abs() + " " + a.ord()) ;
    a.translate(2, 0) ;
    System.out.println ("Je suis un point de coordonnees "
                        + a.abs() + " " + a.ord()) ;
    Point b = new Point(6, 8) ;
    System.out.println ("Je suis un point de coordonnees "
                        + b.abs() + " " + b.ord()) ;
  }
}


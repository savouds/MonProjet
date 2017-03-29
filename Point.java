/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class Point extends Object{
// attribut
 private int x ;   // abscisse
  private int y ;   // ordonnee

//Constructeurs
public Point (int abs, int ord)      { x = abs ;  y = ord ; }

  public void translate (int dx, int dy) { x += dx ;  y += dy ; }

//Modificateurs
public void setX(int p) {
this.x = p;
}
public void setY(int p) {
this.y = p;
}
//Accesseurs
public int abs () {

  return x;
}
public int ord() {
return y;
}
}


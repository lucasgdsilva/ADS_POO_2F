/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import org.checkerframework.checker.units.qual.A;

public class App {

    public static void main(String[] args) {
        Aldeao a = new Aldeao(25, 1, 0.8);
        Arqueiro ar = new Arqueiro(35, 2, 1);
        Cavaleiro c = new Cavaleiro(50, 3, 2);

        System.out.println(a.mover());
        System.out.println(a.atacar());
        System.out.println(ar.mover());
        System.out.println(c.atacar());
        System.out.println(c.mover());

    }
}

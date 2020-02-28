/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17;

/**
 *
 * @author afernandezfontenla
 */
public class Boletin_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Avestruz avestruz = new Avestruz();
        System.out.println("Avestruz:");
        avestruz.camiñar();
        Gato gato = new Gato();
        System.out.println("Gato:");
        gato.camiñar();
        gato.nadar();
        Morcego morcego = new Morcego();
        System.out.println("Morcego:");
        morcego.camiñar();
        morcego.voar();
        Papagaio papagaio = new Papagaio();
        System.out.println("Papagaio:");
        papagaio.camiñar();
        papagaio.voar();
        Tigre tigre = new Tigre();
        System.out.println("Tigre:");
        tigre.camiñar();
        tigre.nadar();
    }
}

}

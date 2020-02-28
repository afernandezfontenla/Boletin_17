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
public class papagayo extends Ave implements IPodeVoar {

    @Override
    public void voar() {
        System.out.println("Pode voar");
    }

}

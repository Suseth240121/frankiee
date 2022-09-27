/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.frankie.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.frankie.entidades.Ingrediente;
import mx.itson.frankie.entidades.Receta;
import mx.itson.frankie.enumerador.Dificultad;

/**
 *
 * @author 
 */
public class Main {
     
    public static void main(String[] args){
        
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setDuracion(62);
       
        List<Ingrediente> ingredientes = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        
        //Agregar pasos
        
        
        receta.setDificultad(Dificultad.INTERMEDIO);
        
    }
    
}

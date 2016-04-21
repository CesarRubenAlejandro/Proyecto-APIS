/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import data.Chile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author Cesar
 */
@ManagedBean (name="controllerReto")
@RequestScoped
public class ControllerReto implements Serializable{
    
    // lista de todos los chiles disponibles en el reto
    private List<Chile> listaChiles;
    // lista de chiles que han sido movidos
    private List<Chile> dropedChiles;
    
    @PostConstruct
    public void init() {
        listaChiles = new ArrayList<Chile>();
        dropedChiles = new ArrayList<Chile>();
        
        // inicializar la lista de chiles
        Chile aux = new Chile("Chile Moruga","escorpion","2 millones de unidades de picor");
        listaChiles.add(aux);
        aux = new Chile("Habanero rojo de Sabina","habanero","500,000 mil a 1 millón de unidades de picor");
        listaChiles.add(aux);
        aux = new Chile("Chile de arbol","chilearbol","15,000 a 30,000 unidades de picor");
        listaChiles.add(aux);
        aux = new Chile("Chile jalapeño, serrano, de árbol","jalapeno","5,000 a 25,000 unidades de picor");
        listaChiles.add(aux);
        aux = new Chile("Pimientos, chile morrón","morron","0 unidades de picor");
        listaChiles.add(aux);
    }

    public List<Chile> getListaChiles() {
        return listaChiles;
    }

    public void setListaChiles(List<Chile> listaChiles) {
        this.listaChiles = listaChiles;
    }

    public List<Chile> getDropedChiles() {
        return dropedChiles;
    }

    public void setDropedChiles(List<Chile> dropedChiles) {
        this.dropedChiles = dropedChiles;
    }
    
    public void onChileDrop(DragDropEvent ddEvent) {
        Chile aux = ((Chile) ddEvent.getData());
        listaChiles.remove(aux);
        dropedChiles.add(aux);
        
        System.out.println("ON DROP" + aux.getNombreChile());
        
    }
}

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
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Angela
 */
@ManagedBean(name = "controllerInformacion")
@SessionScoped
public class ControllerInformacion implements Serializable {
    private List<Chile> chiles;
    private Chile selectedChile;
    private List<String> imagesAgua;
    private List<String> imagesHidrocarburo;
    
    @PostConstruct
    public void init() {
        // inicializar la lista de chiles
        chiles = new ArrayList<Chile>();
        Chile aux = new Chile("Pimientos, chile morrón","morron","0 unidades de picor");
        chiles.add(aux);
        aux = new Chile("Chile jalapeño, serrano, de árbol","jalapeno","5,000 a 25,000 unidades de picor");
        chiles.add(aux);
        aux = new Chile("Chile de árbol","chilearbol","15,000 a 30,000 unidades de picor");
        chiles.add(aux);
        aux = new Chile("Habanero rojo de Sabina","habanero","500,000 mil a 1 millón de unidades de picor");
        chiles.add(aux);
        aux = new Chile("Chile Moruga","escorpion","2 millones de unidades de picor");
        chiles.add(aux);
        aux = new Chile("Capsaicina pura","capsaicinapura","16 millones de unidades de picor");
        chiles.add(aux);
        
        
        imagesAgua = new ArrayList<String>();
        for (int i = 1; i <= 2; i++) {
            imagesAgua.add("agua" + i + ".png");
        }
        imagesHidrocarburo = new ArrayList<String>();
        for (int i = 1; i <= 2; i++) {
            imagesHidrocarburo.add("hidrocarburo" + i + ".gif");
        }
    }
    
    public List<String> getImagesAgua() {
        return imagesAgua;
    }
    
    public List<String> getImagesHidrocarburo() {
        return imagesHidrocarburo;
    }

    public List<Chile> getChiles() {
        return chiles;
    }

    public void setChiles(List<Chile> chiles) {
        this.chiles = chiles;
    }

    public Chile getSelectedChile() {
        return selectedChile;
    }

    public void setSelectedChile(Chile selectedChile) {
        this.selectedChile = selectedChile;
    }
    
    
   
}

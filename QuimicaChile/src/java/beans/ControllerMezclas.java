/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import data.Alimento;
import data.Chile;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author Cesar
 */
@ManagedBean (name = "controllerMezclas")
@SessionScoped
public class ControllerMezclas implements Serializable{
    
    private ArrayList<Alimento> alimentos;
    private Alimento alimentoActual;
    
    @PostConstruct
    public void init() {
        // inicializar lista de alimentos
        alimentos = Alimento.getListaAlimentos();
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public Alimento getAlimentoActual() {
        return alimentoActual;
    }

    public void setAlimentoActual(Alimento alimentoActual) {
        this.alimentoActual = alimentoActual;
    }
    
    public void availableToSelectListener(DragDropEvent ddEvent) {
        Alimento aux = ((Alimento) ddEvent.getData());    
        alimentoActual = aux;
    }
        
}

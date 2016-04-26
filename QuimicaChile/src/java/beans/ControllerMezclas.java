/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import data.Alimento;
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
    private boolean banderaResultado;
    private boolean banderaSolvente;
    
    @PostConstruct
    public void init() {
        // inicializar lista de alimentos
        alimentos = Alimento.getListaAlimentos();
        // bandera para panel e imagen de resultado apagada
        banderaResultado = false;
        banderaSolvente = false;
    }

    public boolean isBanderaSolvente() {
        return banderaSolvente;
    }

    public void setBanderaSolvente(boolean banderaSolvente) {
        this.banderaSolvente = banderaSolvente;
    }

    public boolean isBanderaResultado() {
        return banderaResultado;
    }

    public void setBanderaResultado(boolean banderaResultado) {
        this.banderaResultado = banderaResultado;
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
        banderaResultado = true;
        banderaSolvente = alimentoActual.getSolvente();
        
    }
        
}

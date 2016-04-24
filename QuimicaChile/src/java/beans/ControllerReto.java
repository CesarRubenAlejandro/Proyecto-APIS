/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import data.Chile;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.DragDropEvent;
import org.primefaces.model.chart.MeterGaugeChartModel;

/**
 *
 * @author Cesar
 */
@ManagedBean(name = "controllerReto")
@SessionScoped
public class ControllerReto implements Serializable {

    // ids de las zonas de seleccion
    private static final String ID_SELECT_1 = "formReto:select1";
    private static final String ID_SELECT_2 = "formReto:select2";
    private static final String ID_SELECT_3 = "formReto:select3";
    private static final String ID_SELECT_4 = "formReto:select4";
    private static final String ID_SELECT_5 = "formReto:select5";
    
    private static final String CHILE_1 = "Chile Moruga";
    private static final String CHILE_2 = "Habanero rojo de Sabina";
    private static final String CHILE_3 = "Chile de arbol";
    private static final String CHILE_4 = "Chile jalapeño";
    private static final String CHILE_5 = "Pimientos, chile morrón";

    // lista de todos los chiles disponibles en el reto
    private List<Chile> listaChiles;
    // chiles seleccionados en cada casilla
    private Chile dropChile1;
    private Chile dropChile2;
    private Chile dropChile3;
    private Chile dropChile4;
    private Chile dropChile5;
    // modelo MeterGauch para resultado del reto
    private MeterGaugeChartModel meterGaugeResultado;
    // bandera para ocultar y mostrar el resultado
    private boolean banderaResultado;

    @PostConstruct
    public void init() {
        banderaResultado = false;
        listaChiles = new ArrayList<>();

        // inicializar la lista de chiles
        Chile aux = new Chile(CHILE_1, "escorpion", "2 millones de unidades de picor");
        listaChiles.add(aux);
        aux = new Chile(CHILE_2, "habanero", "500,000 mil a 1 millón de unidades de picor");
        listaChiles.add(aux);
        aux = new Chile(CHILE_3, "chilearbol", "15,000 a 30,000 unidades de picor");
        listaChiles.add(aux);
        aux = new Chile(CHILE_4, "jalapeno", "5,000 a 25,000 unidades de picor");
        listaChiles.add(aux);
        aux = new Chile(CHILE_5, "morron", "0 unidades de picor");
        listaChiles.add(aux);

        // incializar meterGauch
        meterGaugeResultado = new MeterGaugeChartModel();
        meterGaugeResultado.setIntervals(initIntervals());
        meterGaugeResultado.setTitle("Resultado");
        meterGaugeResultado.setGaugeLabel("%");
        meterGaugeResultado.setSeriesColors("FF0000,FF7300,FFEE00,9DFF00,26FF00");
        meterGaugeResultado.setIntervalOuterRadius(100);
        meterGaugeResultado.setGaugeLabelPosition("bottom");
    }

    public boolean isBanderaResultado() {
        return banderaResultado;
    }

    public void setBanderaResultado(boolean banderaResultado) {
        this.banderaResultado = banderaResultado;
    }

    public MeterGaugeChartModel getMeterGaugeResultado() {
        return meterGaugeResultado;
    }

    public void setMeterGaugeResultado(MeterGaugeChartModel meterGaugeResultado) {
        this.meterGaugeResultado = meterGaugeResultado;
    }

    public Chile getDropChile1() {
        return dropChile1;
    }

    public void setDropChile1(Chile dropChile1) {
        this.dropChile1 = dropChile1;
    }

    public Chile getDropChile2() {
        return dropChile2;
    }

    public void setDropChile2(Chile drop2) {
        this.dropChile2 = drop2;
    }

    public Chile getDropChile3() {
        return dropChile3;
    }

    public void setDropChile3(Chile dropChile3) {
        this.dropChile3 = dropChile3;
    }

    public Chile getDropChile4() {
        return dropChile4;
    }

    public void setDropChile4(Chile dropChile4) {
        this.dropChile4 = dropChile4;
    }

    public Chile getDropChile5() {
        return dropChile5;
    }

    public void setDropChile5(Chile dropChile5) {
        this.dropChile5 = dropChile5;
    }

    public List<Chile> getListaChiles() {
        return listaChiles;
    }

    public void setListaChiles(List<Chile> listaChiles) {
        this.listaChiles = listaChiles;
    }
    
    /**
     * metodo para inicializar los intervalos del MeterGauge para el resltado
     * @return 
     */
    private List<Number> initIntervals() {
        List<Number> intervals = new ArrayList<Number>(){{
            add(20);
            add(40);
            add(60);
            add(80);
            add(100);
        }};
         
        return  intervals;
    }

    public void revisaResultados(){
        int acumResultado = 0;
        try{
            if(dropChile1.getNombreChile().equals(CHILE_1)){
                System.out.println("BIEN 1");
                acumResultado += 20;
            }
            if(dropChile2.getNombreChile().equals(CHILE_2)){
                System.out.println("BIEN 2");
                acumResultado += 20;
            }
            if(dropChile3.getNombreChile().equals(CHILE_3)){
                System.out.println("BIEN 3");
                acumResultado += 20;
            }
            if(dropChile4.getNombreChile().equals(CHILE_4)){
                System.out.println("BIEN 4");
                acumResultado += 20;
            }
            if(dropChile5.getNombreChile().equals(CHILE_5)){
                System.out.println("BIEN 5");
                acumResultado += 20;
            }
            banderaResultado = true;
            meterGaugeResultado.setValue(acumResultado);
            } catch(Exception e) {
       
            }
        
    }
    
    public void deleteChile(int idChile) {
        banderaResultado = false;
        switch (idChile){
            case 1:
                listaChiles.add(dropChile1);
                dropChile1 = null;
                break;
            case 2:
                listaChiles.add(dropChile2);
                dropChile2 = null;
                break;
            case 3:
                listaChiles.add(dropChile3);
                dropChile3 = null;
                break;    
            case 4:
                listaChiles.add(dropChile4);
                dropChile4 = null;
                break;
            case 5:
                listaChiles.add(dropChile5);
                dropChile5 = null;
                break;
        }
    }
    
    /**
     * Metodo listener para el caso que se arrastra desde el area de 
     * chiles disponibles al area de seleccion
     * @param ddEvent 
     */
    public void availableToSelectListener(DragDropEvent ddEvent) {
        banderaResultado = false;
        Chile aux = ((Chile) ddEvent.getData());
        switch (ddEvent.getDropId()) {
            case ID_SELECT_1:
                if (dropChile1==null){
                    dropChile1 = aux;
                    listaChiles.remove(aux);
                }   break;
            case ID_SELECT_2:
                if (dropChile2 == null){
                    dropChile2 = aux;
                    listaChiles.remove(aux);
                }   break;
            case ID_SELECT_3:
                if (dropChile3 == null){
                    dropChile3 = aux;
                    listaChiles.remove(aux);
            }   break;
            case ID_SELECT_4:
                if (dropChile4 == null){
                    dropChile4 = aux;
                    listaChiles.remove(aux);
            }   break;
            case ID_SELECT_5:
                if (dropChile5 == null){
                    dropChile5 = aux;
                    listaChiles.remove(aux);
            }   break;
        }
    }
}

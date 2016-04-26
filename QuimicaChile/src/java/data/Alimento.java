/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class Alimento {
    
    private static final String ALIMENTO_1 = "Leche";
    private static final String ALIMENTO_2 = "Agua";
    private static final String ALIMENTO_3 = "Alcohol";
    private static final String ALIMENTO_4 = "Helado";
    
    private static final String DESC_1  = "Contiene caseína, que es no polar, lo que causa que atrape las moléculas de la capsaicina y las disuelva. ";
    private static final String DESC_2  = "El agua es polar, por lo tanto no elimina el picante de la capsaicina";
    private static final String DESC_3  = "El alcohol es polar, por lo cual no disuelve la capsaicina";
    private static final String DESC_4  = "El helado contiene componentes no polares";
    
    private String nombreAlimento;
    private String img;
    private String descripcion;
    private Boolean solvente;

    public Alimento(String nombreAlimento, String img, String descripcion, Boolean solvente) {
        this.nombreAlimento = nombreAlimento;
        this.img = img;
        this.descripcion = descripcion;
        this.solvente = solvente;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getSolvente() {
        return solvente;
    }

    public void setSolvente(Boolean solvente) {
        this.solvente = solvente;
    }
    
    /**
     * Metodo para inicializar la lista de alimentos
     * @return 
     */
    public static ArrayList<Alimento> getListaAlimentos(){
        ArrayList<Alimento> alimentos = new ArrayList<>();
        Alimento aux = new Alimento(ALIMENTO_1, "leche", DESC_1,true );
        alimentos.add(aux);
        aux = new Alimento(ALIMENTO_2, "agua", DESC_2, false );
        alimentos.add(aux);
        aux = new Alimento(ALIMENTO_3, "alcohol", DESC_3, false );
        alimentos.add(aux);
        aux = new Alimento(ALIMENTO_4, "helado", DESC_4, true );
        alimentos.add(aux);
        return alimentos;
    }
    
}

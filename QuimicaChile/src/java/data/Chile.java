/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Cesar
 */
public class Chile {
    private String nombreChile;
    private String img;
    private String picor;

    public Chile(String nombreChile, String img, String picor) {
        this.nombreChile = nombreChile;
        this.img = img;
        this.picor = picor;
    }
    
    public Chile(){
        this.nombreChile = "";
        this.img = "";
        this.picor="";
    }

    public String getNombreChile() {
        return nombreChile;
    }

    public void setNombreChile(String nombreChile) {
        this.nombreChile = nombreChile;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPicor() {
        return picor;
    }

    public void setPicor(String picor) {
        this.picor = picor;
    }
    
}

package com.example.leccion1912;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Revista {
    private String fecha;
    private String enlace;
    private String portada;

    public Revista(JSONObject a) throws JSONException {
        fecha =  "Año: "+a.getString("anio").toString() +" |"+" Mes: "+ a.getString("mes").toString();
        portada = "https://uteq.edu.ec/assets/images/newspapers/" + a.getString("urlportada").toString() ;
        enlace = "https://www.uteq.edu.ec/revista-uteq/2025/" + a.getString("urlpw").toString() ;
    }
    public static ArrayList<Revista> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Revista> revistas = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            revistas.add(new Revista(datos.getJSONObject(i)));
        }
        return revistas;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }


}

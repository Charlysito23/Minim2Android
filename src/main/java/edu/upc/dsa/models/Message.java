package edu.upc.dsa.models;

public class Message {
    String cuerpoMensaje;
    public Message(){}
    public Message(String cuerpoMensaje){
        this.cuerpoMensaje=cuerpoMensaje;
    }

    public String getCuerpoMensaje() {
        return cuerpoMensaje;
    }

    public void setCuerpoMensaje(String cuerpoMensaje) {
        this.cuerpoMensaje = cuerpoMensaje;
    }
}
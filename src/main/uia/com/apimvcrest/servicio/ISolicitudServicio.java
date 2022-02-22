package uia.com.apimvcrest.servicio;
import uia.com.apimvcrest.modelo.Solicitud;
import uia.com.apimvcrest.modelo.SolicitudOrdenCompra;

import java.util.ArrayList;

public interface ISolicitudServicio {
    ArrayList<SolicitudModelo> getSolicitudes();
    Object getSolicitudes(int id);
    void print();

    SolicitudModelo deleteSolicitud(int id);
    SolicitudModelo putSolicitud(int id, SolicitudOrdenCompra newItem);
}


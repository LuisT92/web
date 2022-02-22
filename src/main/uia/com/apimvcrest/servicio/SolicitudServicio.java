package uia.com.apimvcrest.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uia.com.apimvcrest.compras.GestorCompras;
import uia.com.apimvcrest.modelo.ReporteModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class SolicitudServicio implements ISolicitudServicio

    GestorCompras miGestorCompras;

    public SolicitudServicio() throws IOException {
    }

    @Autowired
    public SolicitudServicio(GestorCompras gestorCompras) throws IOException {
        this.miGestorCompras = gestorCompras;
    }

    @Override
    public ArrayList<SolicitudModelo> getSolicitud() {
        return miGestorCompras.getSolicitud();
    }

    @Override
    public SolicitudModelo getSolicitud(int id)
    {
        return miGestorCompras.getsolicitud(id);
    }

    @Override
    public void print()
    {
        miGestorCompras.printMiModeloSolicitud();
    }

    @Override
    public SolicitudModelo deleteSolicitud(int id) {
        return miGestorCompras.deleteSolicitud(id);
    }

    @Override
    public SolicitudModelo putSolicitud(int id, ItemComprasUIAModelo newItem)
    {
        return miGestorCompras.putSolicitud(id, newItem);
    }
}

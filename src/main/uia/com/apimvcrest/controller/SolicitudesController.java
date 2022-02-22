package uia.com.apimvcrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uia.com.apimvcrest.modelo.ReporteModelo;
import uia.com.apimvcrest.modelo.ItemComprasUIAModelo;
import uia.com.apimvcrest.servicio.ReportesServicio;

import java.io.IOException;
import java.util.List;

@Controller
public class SolicitudController
{
    private SolicitudService servicioSolicitudes;
    //ArrayList<ReporteModelo> reportees = new ArrayList<ReporteModelo>();

    @Autowired
    public SolicitudController(SolicitudController solicitud) throws IOException {
        this.solicitudServicio = solicitud;
    }



    @GetMapping("/viewSolicitudes")
    public String viewSolicitudes(ModelMap model)
    {
        List<SolicitudMoldelo> solicitudes = servicioSolicitudes.getSolicitudes();
        System.out.println("Solicitudes: " + solicitudes.toString());
        model.addAttribute("Solicitud", servicioSolution.getSolicitudes());
        return "view-solicitudes";
    }

    @GetMapping("/solicitudes/{id}")
    public SolicitudMoldelo solicitudById(@PathVariable int id)
    {
        return  solicitudModelo.getSolicitudes(id);
    }

    @DeleteMapping("/solicitudes/{id}")
    public SolicitudMoldelo solicitudById(@PathVariable int id)SolicitudById(@PathVariable int id)
    {
        return  SolicitudServicio.deletesolicitud(id);
    }

    @PutMapping("/solicitud/{id}")
    public SolicitudMoldelo solicitudById(@PathVariable int id @RequestBody ItemComprasUIAModelo newItem)
    {
        return  SolicitudServvicio.putSolicitud(id, newItem);
    }

    public SolicitidServicio getSolicitudServicio() {
        return SolicitudServicio;
    }

    public void setServicioReportes(SolicitudServicio solicitudServicio) {
        this.solicitudServicio = solicitudServicio;
    }
}

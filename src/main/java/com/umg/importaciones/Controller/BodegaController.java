package com.umg.importaciones.Controller;

import com.umg.importaciones.Entity.Bodega;
import com.umg.importaciones.Service.BodegaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/bodegas")
public class BodegaController {

    private final BodegaService bodegaService;

    public BodegaController(BodegaService bodegaService) {
        this.bodegaService = bodegaService;
    }

    @GetMapping
    public List<Bodega> listar() {
        return bodegaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Bodega obtener(@PathVariable Long id) {
        return bodegaService.buscarPorId(id);
    }

    @PostMapping
    public Bodega crear(@RequestBody Bodega bodega) {
        return bodegaService.guardar(bodega);
    }

    @PutMapping("/{id}")
    public Bodega actualizar(@PathVariable Long id, @RequestBody Bodega bodega) {
        bodega.setIdBodega(id);
        return bodegaService.guardar(bodega);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        bodegaService.eliminar(id);
    }
}


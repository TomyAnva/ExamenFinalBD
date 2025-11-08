package com.umg.importaciones.Controller;

import com.umg.importaciones.Entity.Movimiento;
import com.umg.importaciones.Service.MovimientoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    private final MovimientoService movimientoService;

    public MovimientoController(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }

    @GetMapping
    public List<Movimiento> listar() {
        return movimientoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Movimiento obtener(@PathVariable Long id) {
        return movimientoService.buscarPorId(id);
    }

    @PostMapping
    public Movimiento crear(@RequestBody Movimiento movimiento) {
        return movimientoService.guardar(movimiento);
    }

    @PutMapping("/{id}")
    public Movimiento actualizar(@PathVariable Long id, @RequestBody Movimiento movimiento) {
        movimiento.setIdMovimiento(id);
        return movimientoService.guardar(movimiento);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        movimientoService.eliminar(id);
    }
}


package com.umg.importaciones.Service;

import com.umg.importaciones.Entity.Movimiento;
import com.umg.importaciones.Repository.MovimientoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovimientoService {

    private final MovimientoRepository movimientoRepository;

    public MovimientoService(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    public List<Movimiento> listarTodos() {
        return movimientoRepository.findAll();
    }

    public Movimiento guardar(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public Movimiento buscarPorId(Long id) {
        return movimientoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        movimientoRepository.deleteById(id);
    }
}


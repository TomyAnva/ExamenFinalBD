package com.umg.importaciones.Service;

import com.umg.importaciones.Entity.Bodega;
import com.umg.importaciones.Repository.BodegaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BodegaService {

    private final BodegaRepository bodegaRepository;

    public BodegaService(BodegaRepository bodegaRepository) {
        this.bodegaRepository = bodegaRepository;
    }

    public List<Bodega> listarTodas() {
        return bodegaRepository.findAll();
    }

    public Bodega guardar(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    public Bodega buscarPorId(Long id) {
        return bodegaRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        bodegaRepository.deleteById(id);
    }
}

package com.umg.importaciones.Repository;

import com.umg.importaciones.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}


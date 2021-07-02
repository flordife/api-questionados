package ar.com.ada.api.questionados.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.ada.api.questionados.entities.Respuesta;

@Repository
public interface RespuestaController extends JpaRepository<Respuesta, Integer> {

}

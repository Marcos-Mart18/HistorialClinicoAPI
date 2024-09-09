package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Especialidad;

@Component
public interface EspecialidadDao {
	Especialidad create(Especialidad e);
	Especialidad update(Especialidad e);
	void delete(Long id);
	Especialidad read(Long id);
	List<Especialidad>readAll();
}

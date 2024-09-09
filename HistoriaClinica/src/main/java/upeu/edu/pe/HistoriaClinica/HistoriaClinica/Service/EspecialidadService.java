package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Especialidad;

@Service
public interface EspecialidadService {
	Especialidad create(Especialidad e);
	Especialidad update(Especialidad e);
	void delete(Long id);
	Especialidad read(Long id);
	List<Especialidad>readAll();
}

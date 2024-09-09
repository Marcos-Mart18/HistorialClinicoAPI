package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Medico;

@Component
public interface MedicoDao {
	Medico create(Medico m);
	Medico update(Medico m);
	void delete(Long id);
	Medico read(Long id);
	List<Medico>readAll();
}

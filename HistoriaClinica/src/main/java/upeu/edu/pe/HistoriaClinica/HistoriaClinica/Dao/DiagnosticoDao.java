package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Diagnostico;


@Component
public interface DiagnosticoDao {
	Diagnostico create(Diagnostico d);
	Diagnostico update(Diagnostico d);
	void delete(Long id);
	Diagnostico read(Long id);
	List<Diagnostico>readAll();
}

package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Diagnostico;

@Service
public interface DiagnosticoService {
	Diagnostico create(Diagnostico d);
	Diagnostico update(Diagnostico d);
	void delete(Long id);
	Diagnostico read(Long id);
	List<Diagnostico>readAll();
}

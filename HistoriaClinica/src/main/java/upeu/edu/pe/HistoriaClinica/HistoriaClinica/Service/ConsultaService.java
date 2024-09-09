package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Consulta;

@Service
public interface ConsultaService {
	Consulta create(Consulta c);
	Consulta update(Consulta c);
	void delete(Long id);
	Consulta read(Long id);
	List<Consulta>readAll();
}

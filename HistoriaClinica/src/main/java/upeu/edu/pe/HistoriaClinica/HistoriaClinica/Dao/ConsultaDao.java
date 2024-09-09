package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Consulta;

@Component
public interface ConsultaDao {
	Consulta create(Consulta c);
	Consulta update(Consulta c);
	void delete(Long id);
	Consulta read(Long id);
	List<Consulta>readAll();
}

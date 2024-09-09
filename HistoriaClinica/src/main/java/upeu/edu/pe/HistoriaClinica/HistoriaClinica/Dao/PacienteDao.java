package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Paciente;

@Component
public interface PacienteDao {
	Paciente create(Paciente p);
	Paciente update(Paciente p);
	void delete(Long id);
	Paciente read(Long id);
	List<Paciente>readAll();
}

package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Paciente;

@Service
public interface PacienteService {
	Paciente create(Paciente p);
	Paciente update(Paciente p);
	void delete(Long id);
	Paciente read(Long id);
	List<Paciente>readAll();
}

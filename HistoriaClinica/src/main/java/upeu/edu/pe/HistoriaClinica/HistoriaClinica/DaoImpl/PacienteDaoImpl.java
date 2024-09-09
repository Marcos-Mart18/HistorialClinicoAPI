package upeu.edu.pe.HistoriaClinica.HistoriaClinica.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao.PacienteDao;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Paciente;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Repository.PacienteRepository;

@Component
public class PacienteDaoImpl implements PacienteDao {
	@Autowired
	private PacienteRepository pacienteRepository;
	@Override
	public Paciente create(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(p);
	}

	@Override
	public Paciente update(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pacienteRepository.deleteById(id);
	}

	@Override
	public Paciente read(Long id) {
		// TODO Auto-generated method stub
		return pacienteRepository.findById(id).get();
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll();
	}

}

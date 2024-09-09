package upeu.edu.pe.HistoriaClinica.HistoriaClinica.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao.PacienteDao;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Paciente;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService{
	@Autowired
	private PacienteDao pacienteDao;
	@Override
	public Paciente create(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteDao.create(p);
	}

	@Override
	public Paciente update(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pacienteDao.delete(id);
	}

	@Override
	public Paciente read(Long id) {
		// TODO Auto-generated method stub
		return pacienteDao.read(id);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return pacienteDao.readAll();
	}

}

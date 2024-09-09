package upeu.edu.pe.HistoriaClinica.HistoriaClinica.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao.MedicoDao;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Medico;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Repository.MedicoRepository;

@Component
public class MedicoDaoImpl implements MedicoDao{
	@Autowired
	private MedicoRepository medicoRepository;
	@Override
	public Medico create(Medico m) {
		// TODO Auto-generated method stub
		return medicoRepository.save(m);
	}

	@Override
	public Medico update(Medico m) {
		// TODO Auto-generated method stub
		return medicoRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicoRepository.deleteById(id);
	}

	@Override
	public Medico read(Long id) {
		// TODO Auto-generated method stub
		return medicoRepository.findById(id).get();
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return medicoRepository.findAll();
	}

}

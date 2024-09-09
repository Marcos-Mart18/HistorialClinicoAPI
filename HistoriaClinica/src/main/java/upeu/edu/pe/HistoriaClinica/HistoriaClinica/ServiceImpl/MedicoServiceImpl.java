package upeu.edu.pe.HistoriaClinica.HistoriaClinica.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao.MedicoDao;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Medico;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService{
	@Autowired
	private MedicoDao medicoDao;
	@Override
	public Medico create(Medico m) {
		// TODO Auto-generated method stub
		return medicoDao.create(m);
	}

	@Override
	public Medico update(Medico m) {
		// TODO Auto-generated method stub
		return medicoDao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicoDao.delete(id);
	}

	@Override
	public Medico read(Long id) {
		// TODO Auto-generated method stub
		return medicoDao.read(id);
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return medicoDao.readAll();
	}

}

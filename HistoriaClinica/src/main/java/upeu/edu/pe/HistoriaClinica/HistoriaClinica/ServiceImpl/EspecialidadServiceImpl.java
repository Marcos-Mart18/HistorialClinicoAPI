package upeu.edu.pe.HistoriaClinica.HistoriaClinica.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Dao.EspecialidadDao;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Especialidad;
import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService{
	@Autowired
	private EspecialidadDao especialidadDao;
	@Override
	public Especialidad create(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadDao.create(e);
	}

	@Override
	public Especialidad update(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadDao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		especialidadDao.delete(id);
	}

	@Override
	public Especialidad read(Long id) {
		// TODO Auto-generated method stub
		return especialidadDao.read(id);
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return especialidadDao.readAll();
	}
	
}

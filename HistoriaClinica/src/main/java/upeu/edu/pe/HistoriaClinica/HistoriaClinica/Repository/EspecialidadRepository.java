package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Long>{

}

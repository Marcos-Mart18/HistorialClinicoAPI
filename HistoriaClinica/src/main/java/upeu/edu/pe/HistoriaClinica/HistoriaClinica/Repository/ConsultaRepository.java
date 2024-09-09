package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Consulta;
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{

}

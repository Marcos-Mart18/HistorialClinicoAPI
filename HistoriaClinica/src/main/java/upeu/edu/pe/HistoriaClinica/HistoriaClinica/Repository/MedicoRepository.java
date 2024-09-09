package upeu.edu.pe.HistoriaClinica.HistoriaClinica.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.HistoriaClinica.HistoriaClinica.Entity.Medico;
@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{
	@Query(
		    value = "SELECT * FROM tbl_medicos WHERE tbl_medicos.nombres LIKE CONCAT ('%', :filtro, '%')",
		    nativeQuery = true
		)
		List<Medico> searchNative(@Param("filtro") String filtro);
}

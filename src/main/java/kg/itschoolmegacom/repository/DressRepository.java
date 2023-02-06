package kg.itschoolmegacom.repository;

import kg.itschoolmegacom.model.entities.Dress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DressRepository extends JpaRepository<Dress, Long> {

    List<Dress> findAllByAvailableIs(boolean available);

}

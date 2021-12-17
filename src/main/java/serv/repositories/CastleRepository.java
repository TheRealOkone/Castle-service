package serv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import serv.models.Castle;

public interface CastleRepository extends JpaRepository<Castle, Integer>{
}

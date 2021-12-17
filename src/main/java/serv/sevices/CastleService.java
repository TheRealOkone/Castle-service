package serv.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serv.models.Castle;
import serv.repositories.CastleRepository;

import java.util.List;

@Service
public class CastleService {
    @Autowired
    private CastleRepository reps;

    public List<Castle> getCastles() {
        return reps.findAll();
    }

    public void createCastle(Castle a) {
        reps.save(a);
    }

    public Castle getCastleById(int castleId) {
        return reps.findById(castleId).get();
    }
}

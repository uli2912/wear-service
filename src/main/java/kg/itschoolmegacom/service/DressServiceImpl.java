package kg.itschoolmegacom.service;

import kg.itschoolmegacom.model.dto.request.DressCalcRequest;

import kg.itschoolmegacom.model.dto.response.DressCalcResponse;
import kg.itschoolmegacom.model.entities.Dress;
import kg.itschoolmegacom.repository.DressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DressServiceImpl implements DressService{

    private final DressRepository dressRepository;

    @Autowired
    public DressServiceImpl(DressRepository dressRepository) {
        this.dressRepository = dressRepository;
    }

    @Override
    public Dress save(Dress dress) {
    return dressRepository.save(dress);
    }

    @Override
    public List<Dress> getAllByAvailable(boolean available) {
        return dressRepository.findAllByAvailableIs(available);
    }

    @Override
    public DressCalcResponse calculate(List<DressCalcRequest> dressCalcRequestsList) {
        List<Dress> dressList = dressRepository.findAllByAvailableIs(true);
        DressCalcResponse dressCalcResponse = new DressCalcResponse();

        dressCalcRequestsList.stream().forEach(dressCalcRequest -> {
        dressCalcRequest.getId();
        });
        return dressCalcResponse;
    }


}

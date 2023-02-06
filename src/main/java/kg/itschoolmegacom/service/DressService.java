package kg.itschoolmegacom.service;

import kg.itschoolmegacom.model.dto.request.DressCalcRequest;
import kg.itschoolmegacom.model.dto.response.DressCalcResponse;
import kg.itschoolmegacom.model.entities.Dress;

import java.util.List;

public interface DressService {

    Dress save(Dress dress);

    List<Dress> getAllByAvailable(boolean available);



    DressCalcResponse calculate(List<DressCalcRequest> dressCalcRequests);
}

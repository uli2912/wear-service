package kg.itschoolmegacom.controllers;

import kg.itschoolmegacom.model.dto.request.DressCalcRequest;
import kg.itschoolmegacom.model.dto.response.DressCalcResponse;
import kg.itschoolmegacom.model.entities.Dress;
import kg.itschoolmegacom.service.DressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dress")
public class DressController {

    private final DressService dressService;

    @Autowired
    public DressController(DressService dressService) {
        this.dressService = dressService;
    }


    @PostMapping("/save")
    public Dress save(@RequestBody Dress dress){
        return dressService.save(dress);
    }

    @GetMapping("/list/{available}")
    public List<Dress> listDresses(@PathVariable boolean available) {
        return dressService.getAllByAvailable(available);
    }

    @PostMapping("/calculate")
    public DressCalcResponse calculateWears(@RequestBody List<DressCalcRequest> dressCalcRequests) {
       return dressService.calculate(dressCalcRequests);
    }
}

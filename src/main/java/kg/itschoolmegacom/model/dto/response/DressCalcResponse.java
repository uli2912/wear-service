package kg.itschoolmegacom.model.dto.response;

import kg.itschoolmegacom.model.entities.Dress;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DressCalcResponse {
    List<Dress> dress;
    Map<Dress, Double> dresses;
    double sum;
}

package controle.financeiro.com.controller;

import controle.financeiro.com.service.ContaBancariaService;
import controle.financeiro.com.to.ContaBancariaTO;
import controle.financeiro.com.to.form.ContaBancariaForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contaBancaria")
public class ContaBancariaController {
    private final ContaBancariaService contaBancariaService;

    ContaBancariaController(ContaBancariaService contaBancariaService) {
        this.contaBancariaService = contaBancariaService;
    }

    @GetMapping
    @RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ContaBancariaTO>> list() {
        List<ContaBancariaTO> list = contaBancariaService.list();

        if(list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/create")
    public ResponseEntity<ContaBancariaTO> create(ContaBancariaForm request) {

        return ResponseEntity.ok(this.contaBancariaService.create(request));
    }
}

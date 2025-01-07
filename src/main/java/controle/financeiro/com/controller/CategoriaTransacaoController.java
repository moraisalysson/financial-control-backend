package controle.financeiro.com.controller;

import controle.financeiro.com.entity.CategoriaTransacao;
import controle.financeiro.com.service.CategoriaTransacaoService;
import controle.financeiro.com.to.CategoriaTransacaoTO;
import controle.financeiro.com.to.ContaBancariaTO;
import controle.financeiro.com.to.form.CategoriaTransacaoForm;
import controle.financeiro.com.to.form.ContaBancariaForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categoria_transacao")
public class CategoriaTransacaoController {
    private final CategoriaTransacaoService categoriaTransacaoService;

    CategoriaTransacaoController(CategoriaTransacaoService categoriaTransacaoService) {
        this.categoriaTransacaoService = categoriaTransacaoService;
    }

    @GetMapping
    @RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoriaTransacaoTO>> list() {
        List<CategoriaTransacaoTO> list = categoriaTransacaoService.list();

        if(list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<CategoriaTransacaoTO> create(@RequestBody CategoriaTransacaoForm request) {

        return ResponseEntity.ok(this.categoriaTransacaoService.create(request));
    }
}

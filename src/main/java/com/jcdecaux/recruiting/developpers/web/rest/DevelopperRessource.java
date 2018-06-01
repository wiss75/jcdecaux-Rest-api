package com.jcdecaux.recruiting.developpers.web.rest;

import com.jcdecaux.recruiting.developpers.Service.DevelopperService;
import com.jcdecaux.recruiting.developpers.domain.Developper;
import com.jcdecaux.recruiting.developpers.repository.DevelopperRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DevelopperRessource {


    private final Logger log = LoggerFactory.getLogger(DevelopperRessource.class);

    @Inject
    private DevelopperRepository developperRepository;

    @Inject
    private DevelopperService developperService;

    @PostMapping("/developpers")
    public Developper createDevelopper(@RequestBody Developper developper) {
        log.debug("REST request to save Developper : {}", developper);
        if (developper.getId() != null) {

        }
        Developper result = developperRepository.save(developper);
        return result;
    }

    @PutMapping("/developpers")
    public Developper updateDevelopper(@RequestBody Developper developper) {
        log.debug("REST request to save Developper : {}", developper);
        if (developper.getId() == null) {
           return createDevelopper(developper);
        }
        Developper result = developperRepository.save(developper);
        return result;
    }

    @GetMapping("/developpers")
    public List<Developper> getDeveloppers()
    {
        return developperRepository.findAll();
    }

    @GetMapping("developpers/{name}")
    public List<Developper> getDeveloppersByPL(@PathVariable String name) {
        return developperService.findByPL(name);
    }


}

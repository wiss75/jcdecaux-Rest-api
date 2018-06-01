package com.jcdecaux.recruiting.developpers.web.rest;

import com.jcdecaux.recruiting.developpers.domain.ProgrammingLanguage;
import com.jcdecaux.recruiting.developpers.repository.ProgrammingLanguageRepository;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProgrammingLanguageRessource {

    private final Logger log = LoggerFactory.getLogger(ProgrammingLanguage.class);

    @Inject
    private ProgrammingLanguageRepository programmingLanguageRepository;


    @PostMapping("/programmingLanguages")
    public ProgrammingLanguage createProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage) {
        log.debug("REST request to save Programming Languages : {}", programmingLanguage);
        if (programmingLanguage.getId() != null) {

        }
        ProgrammingLanguage result = programmingLanguageRepository.save(programmingLanguage);
        return result;
    }

    @PutMapping("/programmingLanguages")
    public ProgrammingLanguage updateProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage) {
        log.debug("REST request to save Programming Language : {}", programmingLanguage);
        if (programmingLanguage.getId() == null) {
            return createProgrammingLanguage(programmingLanguage);
        }
        ProgrammingLanguage result = programmingLanguageRepository.save(programmingLanguage);
        return result;
    }

    @GetMapping("/programmingLanguages")
    public List<ProgrammingLanguage> getProgrammingLanguage()
    {
        return programmingLanguageRepository.findAll();
    }
}

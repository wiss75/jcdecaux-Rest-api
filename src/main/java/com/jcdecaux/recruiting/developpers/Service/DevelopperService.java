package com.jcdecaux.recruiting.developpers.Service;

import com.jcdecaux.recruiting.developpers.domain.Developper;
import com.jcdecaux.recruiting.developpers.domain.ProgrammingLanguage;
import com.jcdecaux.recruiting.developpers.repository.DevelopperRepository;
import com.jcdecaux.recruiting.developpers.repository.ProgrammingLanguageRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service

public class DevelopperService {

    @Inject
    private ProgrammingLanguageRepository programmingLanguageRepository;
    @Inject
    private DevelopperRepository developperRepository;


    public List<Developper> findByPL(String name)
    {
        ProgrammingLanguage programmingLanguage=programmingLanguageRepository.findByName(name);
        if (programmingLanguage!=null)
            return developperRepository.findByProgrammingLanguagesIn(programmingLanguage);
        else
            return new ArrayList<>();
    }
}

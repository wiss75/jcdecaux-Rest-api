package com.jcdecaux.recruiting.developpers.repository;

import com.jcdecaux.recruiting.developpers.domain.Developper;
import com.jcdecaux.recruiting.developpers.domain.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DevelopperRepository extends JpaRepository<Developper,Long> {

    List<Developper> findByProgrammingLanguagesIn(ProgrammingLanguage programmingLanguage);

}

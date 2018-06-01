package com.jcdecaux.recruiting.developpers.repository;

import com.jcdecaux.recruiting.developpers.domain.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {

    ProgrammingLanguage findByName(String name);
}


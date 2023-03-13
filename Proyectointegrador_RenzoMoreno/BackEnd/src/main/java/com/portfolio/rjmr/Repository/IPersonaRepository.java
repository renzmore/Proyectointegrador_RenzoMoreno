package com.portfolio.rjmr.Repository;

import com.portfolio.rjmr.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}

package com.portfolio.rjmr.Interface;

import com.portfolio.rjmr.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer Lista de Persona

    public List<Persona> getPersona();
//Guardar un Objeto de tipo Persona

    public void savePersona(Persona persona);
//Eliminar una Persona por Id

    public void deletePersona(Long id);
//Buscar una Persona por id

    public Persona findPersona(Long id);

}

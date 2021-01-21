/*
 * #9 FÁBRICAS COM CDI 
 * Implementar cliente para o serviço de CEP Widenet Properties.
 * Crie o projeto mostrado no vídeo a seguir. (https://www.youtube.com/watch?v=pEanb1neZvs&feature=emb_title)
 * Inclua um cliente para o serviço de consulta de CEP Widenet, definindo a classe 
 * criada como padrão para injeção no serviço REST criado. O link a seguir mostra 
 * um exemplo de consulta a tal API.
 * https://cep.widenet.host/busca-cep/api/cep/77021090.json
 * Disponibilize o projeto no GitHub e forneça o link no moodle.
 */
package com.lidiane.rest;

import com.lidiane.cepservice.model.Endereco;
import com.lidiane.cepservice.CepService;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cep")
public class CepResource {
    
     /**
     * Injeta (instancia automaticamente) um objeto de serviço de CEP.
     * Como temos dois serviços de CEP que podemos consultar,
     * a classe do serviço que estiver alguma anotação de escopo
     * como @Dependent, @RequestScoped, @SessionScoped ou @ApplicationScoped
     * será injetada.
     */
    @Inject
    CepService service;

    @GET
    @Path("/{cep}")
    @Produces(MediaType.APPLICATION_JSON)
    public Endereco getEndereco(@PathParam("cep") String cep) {
        return service.buscaEndereco(cep);
    }
}
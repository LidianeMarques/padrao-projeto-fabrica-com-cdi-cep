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
package com.lidiane.cepservice;

import javax.enterprise.context.Dependent;

@Dependent
public class PostmonCepService extends AbstractCepService {

    public PostmonCepService() {
        super("https://api.postmon.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("/v1/cep/%s", cep);
        
    }
    
}

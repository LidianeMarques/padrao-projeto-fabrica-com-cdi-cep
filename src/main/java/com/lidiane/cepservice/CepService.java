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

import com.lidiane.cepservice.model.Endereco;

/**
 *
 * @author Lidiane
 */

/**
 * Define uma interface para a implementação
 * de serviços de busca de CEP.
 * 
 * @author Manoel Campos da Silva Filho
 */
public interface CepService {
    
     /**
     * Busca um endereço a partir de um CEP.
     * @param cep CEP para buscar o endereço
     * @return o {@link Endereco} correspondente ao CEP informado
     */
    Endereco buscaEndereco(String cep);
    
}

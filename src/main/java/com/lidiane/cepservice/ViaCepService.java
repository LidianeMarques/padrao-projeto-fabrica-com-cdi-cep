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

/**
 * Acesso à API REST to serviço <a href="https://viacep.com.br">ViaCEP</a>.
 * Exemplo de requisição: <a href="https://viacep.com.br/ws/01001000/json/">https://viacep.com.br/ws/01001000/json/</a>.
 *
 * <p>Observe que foi utilizada a anotação de escopo
 * @Dependent para indicar que esta classe (e não a outra implementação de
 * busca de CEP em {@link PostmonService}) é que deve ser utilizada
 * pelo serviço REST {@link com.manoelcampos.rest.CepResource}.</p>
 *
 * @author Manoel Campos da Silva Filho
 */

 
public final class ViaCepService extends AbstractCepService {

    public ViaCepService() {
        super("https://viacep.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("ws/%s/json", cep);
    }
    
}

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
import java.util.logging.Logger;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * Implementação abstrata para serviços de consulta de CEP.
 * @author Manoel Campos da Silva Filho
 */

public abstract class AbstractCepService implements CepService {

    private static final Logger LOG = Logger.getLogger(AbstractCepService.class.getName());
    
    

    private final String dominio;
    private final WebTarget target;

    
    
     /**
     * Instancia o serviço de CEP, definindo a URL base para acesso.
     * O construtor é protegido, pois, não queremos que quem for utilizar
     * as subclasses desta, possa indicar o domínio.
     * Classes filhas como {@link ViaCepService} são utilizadas para acesso
     * a um serviço específico, cujo domínio é definida pela própria subclasse.
     * Quem for utilizar tal subclasse não deve ter permissão para alterar o domínio.
     *
     * @param dominio domínio para acesso ao serviço
     * 
     */
    public AbstractCepService(String dominio) {
        this.dominio = insertTrailingSlash(dominio);
        final Client client = ClientBuilder.newClient();
        this.target = client.target(dominio);
    }
    
    

    @Override
    public Endereco buscaEndereco(String cep) {
        
        LOG.info(String.format("Buscando endereço para o cep %s usando o serviço %s", cep, dominio));
        
         /**
         * Usa o objeto target para enviar uma requisição HTTP
         * para o serviço de CEP, passando um cep específico por parâmetro.
         * O objeto target já foi previamente associado ao domínio do serviço.
         * Utilizando o método path(), passamos o resultado do método
         * {@link #buildPath(String)} para ele, que representa o restante
         * do endereço para consultar um determinado CEP.
         * Após usar o path para definir o endereço completo
         * que desejamos acessar, a requisição HTTP é construída por meio do método
         * request(). Em seguida, enviamos a requisição usando o método get
         * do protocolo HTTP (pois os serviços de CEP utilizados todos requerem
         * que tal método seja usado).
         *
         * Como estamos usando a API JAX-RS para consumir o serviço de CEP,
         * ela assumi por padrão que a resposta retornada pelo serviço
         * é em formato JSON, que é o caso para os serviços de CEP.
         * Passando a classe {@link Endereco} por parâmetro para o método get,
         * estamos indicando que o objeto JSON recebido deve ser automaticamente
         * convertido para um objeto java da classe {@link Endereco}.
         */
        return target.path(buildPath(cep)).request().get(Endereco.class);
    }
    
    
    /**
     * Insere uma barra no final de um endereço, caso ainda não tenha.
     * @param url endereço a ser adicionada a barra no final
     * @return
     */
    protected final String insertTrailingSlash(final String url) {
        return url.endsWith("/") ? url : url + "/";
    }
    
    
    /**
     * Constroi o caminho relativo, a partir da {@link #dominio}, para acesso ao endpoint
     * do serviço de busca de endereço.
     * Tal caminho é usado para construir a URL completa do endpoint.
     *
     * @param cep CEP para buscar o endereço
     * @return o caminho relativo do endpoint de busca de CEP
     */
    protected abstract String buildPath(String cep);
    
    
    /**
     * Obtém a URI completa de uma requisição para buscar um determinado endereço a partir
     * de um CEP. O método é utilizado apenas para exibir tal URI no terminal sempre que uma requisição
     * é enviada.
     * @param cep CEP que deseja-se consultar
     * @return a URI completa da requisição
     */
    private String getFullPath(final String cep){
        return dominio + buildPath(cep);
    }
}

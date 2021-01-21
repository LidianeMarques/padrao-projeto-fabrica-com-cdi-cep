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
package com.lidiane.cepservice.model;

/**
 *
 * @author Lidiane
 */
public class Endereco {
    
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String cep;

    /**
     * @return the logradouro
     */
    protected String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    protected void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the complemento
     */
    protected String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    protected void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    protected String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    protected void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the localidade
     */
    protected String getLocalidade() {
        return localidade;
    }

    /**
     * @param localidade the localidade to set
     */
    protected void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    /**
     * @return the uf
     */
    protected String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    protected void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the cep
     */
    protected String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    protected void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}

# <h1 align="center"> Padrões de Projeto </h1>
<hr/>

## <h2 align="center">Padrões de Projetos Factory Method </h2>

### <h3 align="center">FÁBRICAS com CDI e framework Quarkus</h3>

<div align="justify">
 
 <p> Neste projeto estou implementando o código do professor Manoel Campos, disponível no vídeo:</p>
 
 [💉☕️ #2 INJEÇÃO de DEPENDÊNCIAS na prática com JAVA, CDI e QUARKUS: consumo de API REST de CEP](https://www.youtube.com/watch?v=pEanb1neZvs&feature=emb_title)
 

 <p>Para entender melhor o conceito do projeto basta clicar nos links abaixo:</p>
 
 [Consumo de Serviços de CEP com framework Quarkus](https://github.com/manoelcampos/quarkus-cep-services)
 
 [💉☕️ #2 INJEÇÃO de DEPENDÊNCIAS na prática com JAVA, CDI e QUARKUS: consumo de API REST de CEP](https://www.youtube.com/watch?v=pEanb1neZvs&feature=emb_title)
 
 
 <p></p>
 

</div>



This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `padrao-projeto-fabrica-com-cdi-cep-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/padrao-projeto-fabrica-com-cdi-cep-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/padrao-projeto-fabrica-com-cdi-cep-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

# RESTEasy JAX-RS

<p>A Hello World RESTEasy resource</p>

Guide: https://quarkus.io/guides/rest-json

# RESTEasy JSON serialisation using Jackson

<p>This example demonstrate RESTEasy JSON serialisation by letting you list, add and remove quark types from a list.</p>
<p><b>Quarked!</b></p>

Guide: https://quarkus.io/guides/rest-json

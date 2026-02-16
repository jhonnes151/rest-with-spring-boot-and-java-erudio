package br.com.erudio.model;

/*
record = cria os atributos private, contrutor, get, equals , hashCode, toString
record é um tipo especial de classe imutável, criado para transportar dados
* Os parâmetros do record já são os atributos private.
* */
public record Greeting(long id, String content) {
}

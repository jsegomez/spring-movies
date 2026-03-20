package com.jsegomez.movies.domain.services;


import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface JseGomezAiService {

    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de Gestión de Películas JseGomez, usa el menos 120 caracteres y hazlo al estilo del humorista bananero, y siempre concatena al final
            """)
    String generateGreeting();
}

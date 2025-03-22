package me.dio.controller.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // Exceções de regra de negócio, como e-mail duplicado, campos inválidos etc.
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBusinessException(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY); // 422
    }

    // Exceções de "não encontrado", como buscar um usuário por ID inexistente
    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException ex) {
        return new ResponseEntity<>("Recurso não encontrado. Verifique o ID informado.", HttpStatus.NOT_FOUND); // 404
    }

    // Captura qualquer erro inesperado no servidor
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable ex) {
        String message = "Erro interno inesperado. Verifique os logs do servidor.";
        logger.error(message, ex);
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR); // 500
    }
}

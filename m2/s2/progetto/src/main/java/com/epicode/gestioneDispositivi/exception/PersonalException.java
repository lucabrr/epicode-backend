package com.epicode.gestioneDispositivi.exception;

public class PersonalException extends RuntimeException {

    public PersonalException(String message) {
        super(message);
    }

    public static class DispositivoNonDisponibileException extends PersonalException {
        public DispositivoNonDisponibileException(String message) {
            super(message);
        }
    }
}

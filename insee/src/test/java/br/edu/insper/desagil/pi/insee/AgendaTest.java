package br.edu.insper.desagil.pi.insee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AgendaTest {
    private Agenda a;

    @BeforeEach
    void setUp() {
        a = new Agenda();
    }

    @Test
    void constroi() {
        assertTrue(a.getEventos().isEmpty());
    }

    @Test
    void adicionaValido() {
        Evento evento = criaEvento(true);

        List<Evento> eventos = new ArrayList<>();
        eventos.add(evento);

        a.adiciona(evento);

        assertEquals(eventos, a.getEventos());
    }

    @Test
    void adicionaInvalido() {
        Evento evento = criaEvento(false);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            a.adiciona(evento);
        });

        assertEquals("Evento inválido!", exception.getMessage());
    }

    private Evento criaEvento(boolean valido) {
        Evento evento = mock(Evento.class);
        when(evento.valido()).thenReturn(valido);
        return evento;
    }
}

package NicoloW3back.entities;

import exception.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDao {
    private final EntityManager entityManager;

    public EventoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Evento newEvento) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEvento);
        transaction.commit();
        System.out.println("L'evento" + newEvento.getTitolo() + " è stato salvato correttamente");
    }

    public Evento getByid(long eventoId) {
        Evento found = entityManager.find(Evento.class, eventoId);
        if (found == null) throw new NotFoundException(eventoId);
        return found;
    }
}

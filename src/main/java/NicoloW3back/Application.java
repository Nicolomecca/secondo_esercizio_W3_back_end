package NicoloW3back;


import NicoloW3back.entities.Evento;
import NicoloW3back.entities.EventoDao;
import NicoloW3back.entities.TipoEvento;
import exception.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventoDao ed = new EventoDao(em);
        Evento primoEvento = new Evento("Concerto", LocalDate.now(), "Concerto dal vivo", TipoEvento.PUBBLICO, 100);

        ed.save(primoEvento);

        try {
            Evento fromDb = ed.getByid(1);
            System.out.println(fromDb);

        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        em.close();
        emf.close();

    }
}

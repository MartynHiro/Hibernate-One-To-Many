import model.Director;
import model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Movie.class)
                .addAnnotatedClass(Director.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Movie movie = session.get(Movie.class, 1);

            System.out.println(movie);


            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}

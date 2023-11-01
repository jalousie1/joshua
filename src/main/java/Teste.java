import model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoJoshua");

    private static final EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {

        // PROCURANDO NO BANCO DE DADOS
        Cliente cliente = entityManager.find(Cliente.class, 1);
        System.out.println("Nome cliente: "+ cliente.getNome());
        System.out.println("Senha cliente: "+ cliente.getSenha());

        // INSERINDO NO BANCO DE DADOS
        //Cliente cliente = new Cliente();
        //cliente.setNome("chris2");
        //cliente.setSenha("12345");

        //entityManager.getTransaction().begin();
        //entityManager.persist(cliente);
        //entityManager.getTransaction().commit();

        //DELETANDO DO BANCO DE DADOS
        //Cliente cliente = entityManager.find(Cliente.class, 2);
        //entityManager.getTransaction().begin();
        //entityManager.remove(cliente);
        //entityManager.getTransaction().commit();

        //MODIFICAR NO BANCO
        //Cliente cliente = new Cliente();
        //cliente.setId(1);
        //cliente.setNome("CHRIS CERTO");
        //cliente.setSenha("senha2");

        //entityManager.getTransaction().begin();
        //entityManager.merge(cliente);
        //entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

}
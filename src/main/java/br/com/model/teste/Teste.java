package br.com.model.teste;

import br.com.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Teste {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CRUD");

    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {
        //Select

        /*br.com.model.teste.Cliente cliente = entityManager.find(br.com.model.teste.Cliente.class, 1);
        System.out.println("Nome do br.com.model.teste.Cliente:  "+ cliente.getNome_aluno());
        */

        //insert

       /* Cliente cliente1 = new Cliente();
        cliente1.setNome_aluno("Enzo");
        entityManager.getTransaction().begin();
        entityManager.persist(cliente1);
        entityManager.getTransaction().commit();/*


        //Delete
       /* br.com.model.teste.Cliente cliente =  entityManager.find(br.com.model.teste.Cliente.class, 2);
        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();*/

        //MODIFY
      /*br.com.model.teste.Cliente cliente = new br.com.model.teste.Cliente();
        cliente.setId_aluno(1);
        cliente.setNome_aluno("Facebook inc");

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();*/

        entityManager.close();
        entityManagerFactory.close();

    }
}

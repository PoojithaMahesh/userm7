package userm7;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserFindAll {
public static void main(String[] args) {
	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Query query=entityManager.createQuery("Select u from User u");
	List<User> users=query.getResultList();
	System.out.println(users);
}
}

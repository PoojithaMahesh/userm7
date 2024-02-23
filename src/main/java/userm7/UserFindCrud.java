package userm7;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserFindCrud {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	User dbUser=entityManager.find(User.class, 1);
	if(dbUser!=null) {
//		id is going to be present
		System.out.println(dbUser);
	}else {
		System.out.println("Sorry id is not present in the database");
	}
	
}
}

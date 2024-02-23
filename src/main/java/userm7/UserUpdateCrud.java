package userm7;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserUpdateCrud {
public static void main(String[] args) {
	User user=new User();
	user.setName("bhuvansudhan");
	user.setAddress("canada");
	UserUpdateCrud crud=new UserUpdateCrud();
	crud.updateUser(10,user);
}
public void updateUser(int id,User user) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	User dbUser=entityManager.find(User.class, id);
	if(dbUser!=null) {
//		id is present pk is present if im going to call merge method then it will update thedata
		EntityTransaction entityTransaction=entityManager.getTransaction();
//		user=100,bhui,canad
		entityTransaction.begin();
		user.setId(id);
//		user=10
		entityManager.merge(user);
		entityTransaction.commit();
	}else {
//		id is not present
//		if im going to call merge method it will insert the data
//		i dont want to insert the data
//		so i will print a message
		System.out.println("Sorry id is not present in the database");
	}
}
}

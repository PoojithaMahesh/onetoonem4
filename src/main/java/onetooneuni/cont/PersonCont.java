package onetooneuni.cont;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneuni.dao.AadharCardDao;
import onetooneuni.dao.PersonDao;
import onetooneuni.dto.AadharCard;
import onetooneuni.dto.Person;

public class PersonCont {
public static void main(String[] args) {
//	Person  person=new Person();
//	person.setId(2);
//	person.setName("shital");
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(102);
//	aadharCard.setName("shitallllll");
//	aadharCard.setAddress("Bangalore");
//
//	person.setAadharCard(aadharCard);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(aadharCard);
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
	
	
	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.getAadharCardById(101);
//	
//	
//	PersonDao personDao=new PersonDao();
//	personDao.getPersonById(1);
		
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setName("manju");
//	aadharCard.setAddress("mysorer");
//	
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.updateAadhar(101, aadharCard);
	
//	Person person=new Person();
//	person.setName("shitalllllllllll");
//
//	PersonDao dao=new PersonDao();
//	dao.updatePerson(2, person);
//	
//	
	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.deleteAadharCard(101);
//	
	
	
	PersonDao dao=new PersonDao();
	dao.deletePerson(2);
	
}
}

package onetooneuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

import onetooneuni.dto.AadharCard;
import onetooneuni.dto.Person;

public class AadharCardDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();	
		}

		public void saveAadharCard(AadharCard card) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(card);
			entityTransaction.commit();
		}
		
		public void getAadharCardById(int id) {
			EntityManager entityManager=getEntityManager();
			AadharCard aadharCard=entityManager.find(AadharCard.class, id);
			System.out.println(aadharCard);
			
		}
		
		public void updateAadhar(int id,AadharCard card) {
			EntityManager entityManager=getEntityManager();
			AadharCard aadharCard=entityManager.find(AadharCard.class, id);
			if(aadharCard!=null) {
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				card.setId(id);
				entityManager.merge(card);
				entityTransaction.commit();
			}else {
				System.out.println("sorry id is not present");
			}
		}
		
		public void deleteAadharCard(int id) {
			EntityManager entityManager=getEntityManager();
			AadharCard aadharCard=entityManager.find(AadharCard.class, id);
			if(aadharCard!=null) {
				EntityTransaction entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.remove(aadharCard);
				entityTransaction.commit();
			}else {
				System.out.println("id is not present");
			}
		}
		

}

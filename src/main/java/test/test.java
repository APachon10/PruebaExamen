package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateUtils.HibernateUtils;
import modelos.bfPlayer;

public class test {
	public static void main(String[] args) {
		test i = new test();
		bfPlayer bp = new bfPlayer();
	
		//Insertar 
		/*bp.setId("Alberto");
		bp.setClase(1);
		bp.setArma_principal(2);
		bp.setDispositivo(2);
		bp.setBajas(100);
		bp.setCaidas(50);
		
		i.insertarIdioma(bp);*/
	
		// Modificar 
		/*i.actualizarIdioma();*/
		
		//Borrar
		/*i.borrarIdioma();*/
		
		//Select  * from a table 
		/*i.selectAllPlayers();
		
		i.skill_death_ratio();*/
		
		/*
	    min = mínimo valor
	    SELECT min(edad) FROM personas;
	    max = máximo valor
	    SELECT max(edad) FROM personas;
	    sum = suma de los valores
	    SELECT sum(edad) FROM personas;
	    avg = media de los valores
	    SELECT avg(edad) FROM personas;
	    count = cantidad de valores
		SELECT count(edad) FROM personas; 
		 */
		//i.join_tables();
		
		//Como llamar a una store procedure.
		/*public static void main(String[] args) throws SQLException{  
			 
	        Connection conn = null;  
	        try {  
	            // Creamos la conexion  
	            conn=ConnectionMySQL.conectar("localhost", "user", "password", "****");  
	            conn.setAutoCommit(false);  
	 
	             CallableStatement cStmt = conn.prepareCall("{call demoSp(?, ?)}");    
	             cStmt.setString(1, "abcdefg");    
	             cStmt.setInt(2, 0);  
	             cStmt.registerOutParameter("inOutParam", Types.INTEGER);    
	 
	             cStmt.execute();    
	             final ResultSet rs = cStmt.getResultSet();  
	 
	             while (rs.next()) {  
	                 System.out.println("Cadena de caracteres pasada como parametro de entrada="+rs.getString("inputParam"));  
	             }    
	 
	             int outputValue = cStmt.getInt("inOutParam");  
	             System.out.println("Parametro de salida incrementado="+outputValue);  
	 
	        }catch (Exception e) {  
	            conn.rollback();  
	            e.printStackTrace();  
	        }finally{  
	            conn.close();  
	        }  
	    }  */
	}
	
	public void insertarIdioma(bfPlayer i) {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t=session.beginTransaction();
			
			session.save(i);
			
			t.commit();
			session.clear();
			session.close();
		}catch(Exception e){
			System.out.println("ERRORR!!!");
			System.out.println("==================");
			e.printStackTrace();
		}
	}
	public void actualizarIdioma() {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t=session.beginTransaction();
			
			String qryString = "update bfPlayer s set s.clase=2 where s.id= "+"'Alberto'";
			Query query = session.createQuery(qryString);
			int count = query.executeUpdate();
			
			t.commit();
			session.clear();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void borrarIdioma() {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t=session.beginTransaction();
			
			Query query = session.createQuery("delete bfPlayer where id = 'Alberto' ");
			int result = query.executeUpdate();
			
			t.commit();
			session.clear();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void selectAllPlayers() {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t=session.beginTransaction();
			Query query = session.createQuery("from bfPlayer");
			List<bfPlayer> jugadores = query.list();
			for (bfPlayer bfPlayer : jugadores) {
				System.out.println(jugadores.toString());
			}
			t.commit();
			session.clear();
			session.close();
		}catch(Exception e){
			System.out.println("ERRORR!!!");
			System.out.println("==================");
			e.printStackTrace();
		}
	}
	public void skill_death_ratio() {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t=session.beginTransaction();
			
			String query2 = "select kills/Deads as kill_death_ratio from bfPlayer ";
			Query query = session.createQuery(query2);
			
			List<bfPlayer> jugadores = query.list();
			System.out.println("Kill/Death_Ratio: "+ jugadores);
			t.commit();
			session.clear();
			session.close();
		}catch(Exception e){
			System.out.println("ERRORR!!!");
			System.out.println("==================");
			e.printStackTrace();
		}
	}
	public void join_tables() {
		Transaction t = null;
		try(Session session = HibernateUtils.getSessionFactory().openSession()){
			t=session.beginTransaction();
			
			String query2 = "SELECT b.id, c.name FROM bfPlayer b, Clase c WHERE c.id = b.id";
			Query query = session.createQuery(query2);
			
			List jugadores = query.getResultList();
			for (int i = 0; i < jugadores.size(); i++) {
				System.out.println(jugadores.get(i).toString());
			}
			
			t.commit();
			session.clear();
			session.close();
		}catch(Exception e){
			System.out.println("ERRORR!!!");
			System.out.println("==================");
			e.printStackTrace();
		}
	}
}

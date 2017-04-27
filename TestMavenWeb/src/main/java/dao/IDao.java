package dao;

import java.util.List;

import metier.Client;
/**
 * interface DAO
 * @author Stagiaire
 *
 */
public interface IDao {

	public long addClient(Client c);
	public List<Client> findAll();

}

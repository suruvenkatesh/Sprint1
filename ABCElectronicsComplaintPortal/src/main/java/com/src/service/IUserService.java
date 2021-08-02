package com.src.service;

import java.util.List;

import com.src.entities.Client;
import com.src.entities.Engineer;
import com.src.exceptions.InvalidClientIdException;
import com.src.exceptions.InvalidEngineerIdException;

public interface IUserService {

	public void saveClient(Client c);
	public Client getClientByCLientId(String clientId)throws InvalidClientIdException ;
	
	public void saveEngineer(Engineer e);
	public Engineer getEngineerById(int id) throws InvalidEngineerIdException;
	public List<Engineer> getEngineersByDomain(String category);
	public String chnageStatusOfComplaint(int complaintId); // returns updated Status , can close the complaint if problem resolve
	
	public Client signIn(Client client);
	public Client signOut(Client client);

}

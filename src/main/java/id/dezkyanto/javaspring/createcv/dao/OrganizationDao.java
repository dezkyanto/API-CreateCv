package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.Organization;


public interface OrganizationDao {

    public int insert(List<Organization> organization);
	
	public int update(List<Organization> organization, String idOrganization);
	
	public List<Organization> getall();
	
	public List<Organization> getById(String idOrganization);
	
	public int removeById(List<Organization> idOrganization);
	
	public int removeAll();
	
}

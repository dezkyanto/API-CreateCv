package id.dezkyanto.javaspring.createcv.dao;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.OrganizationModel;


public interface OrganizationDao {

    public int insert(List<OrganizationModel> organization);
	
	public int update(List<OrganizationModel> organization, String idOrganization);
	
	public List<OrganizationModel> getall();
	
	public List<OrganizationModel> getById(String idOrganization);
	
	public int removeById(List<OrganizationModel> idOrganization);
	
	public int removeAll();
	
}

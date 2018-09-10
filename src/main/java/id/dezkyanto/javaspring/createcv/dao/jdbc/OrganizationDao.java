package id.dezkyanto.javaspring.createcv.dao.jdbc;

import java.util.List;
import id.dezkyanto.javaspring.createcv.model.OrganizationModel;

public interface OrganizationDao {

    public int insert(List<OrganizationModel> organization,String idPersonalData);
	
	public int update(List<OrganizationModel> organization, String idPersonalData);
	
	
	public List<OrganizationModel> getById(String idPersonalData);
	
	public int removeById(String idPersonalData);
	
	public int removeByIdOrganization(String id);
	
	public int removeAll();
	
}

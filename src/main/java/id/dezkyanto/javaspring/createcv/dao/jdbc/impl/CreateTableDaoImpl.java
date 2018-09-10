package id.dezkyanto.javaspring.createcv.dao.jdbc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import id.dezkyanto.javaspring.createcv.dao.jdbc.CreateTableDao;

@Transactional
@Repository
public class CreateTableDaoImpl implements CreateTableDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String createTableEducation() {

		String query = " CREATE TABLE public.pendidikan " + " ( " + " id character varying(32) NOT NULL, "
				+ " id_datadiri character varying(32), " + " jenis_pendidikan character varying, "
				+ " nama_institusi character varying, " + " alamat_institusi character varying, "
				+ " start character varying, " + " endd character varying, "
				+ " CONSTRAINT pendidikan_pkey PRIMARY KEY (id) " + " ) " + " WITH ( " + " OIDS=FALSE " + " ); "
				+ " ALTER TABLE public.pendidikan " + " OWNER TO admin; ";

		jdbcTemplate.update(query);
		return "<h3 style=\"color:#4CAF50\">Create Table Education : Done!<h3>";

	}

	@Override
	public String createTableOrganization() {
		String query = " CREATE TABLE public.organisasi " + " ( " + " id character varying(32) NOT NULL, "
				+ " id_datadiri character varying(32), " + " nama_organisasi character varying, "
				+ " start character varying, " + " endd character varying, " + " deskripsi character varying, "
				+ " CONSTRAINT organisasi_pkey PRIMARY KEY (id) " + " ) " + " WITH ( " + " OIDS=FALSE " + " ); "
				+ " ALTER TABLE public.organisasi " + " OWNER TO admin; ";

		jdbcTemplate.update(query);
		return "<h3 style=\"color:#4CAF50\">Create Table Organization : Done!<h3>";
	}

	@Override
	public String createTablePersonalData() {
		String query = "CREATE TABLE public.datadiri" + "(" + "id character varying(32) NOT NULL,"
				+ " nama_lengkap character varying," + "  tempat_lahir character varying," + "alamat character varying,"
				+ " no_tfn_wa character varying," + "  email character varying," + "linkedin character varying,"
				+ "  git character varying," + " motto character varying," + " hobbi character varying,"
				+ " tanggal_lahir date," + " CONSTRAINT datadiri_pkey PRIMARY KEY (id)" + ")" + "WITH (" + "OIDS=FALSE"
				+ ");" + "ALTER TABLE public.datadiri" + " OWNER TO admin;";

		jdbcTemplate.update(query);
		return "<h3 style=\"color:#4CAF50\">Create Table Personal Data : Done!<h3>";
	}

	@Override
	public String createTableSkill() {
		String query = " CREATE TABLE public.kemampuan " + " ( " + " id character varying(32) NOT NULL, "
				+ " id_datadiri character varying(32), " + " skill character varying, "
				+ " persentase character varying, " + " deskripsi character varying, "
				+ " CONSTRAINT kemampuan_pkey PRIMARY KEY (id) " + " ) " + " WITH ( " + " OIDS=FALSE " + " ); "
				+ " ALTER TABLE public.kemampuan " + " OWNER TO admin; ";

		jdbcTemplate.update(query);
		return "<h3 style=\"color:#4CAF50\">Create Table Skill : Done!<h3>";
	}

	@Override
	public String createTableWorkExperience() {
		String query = " CREATE TABLE public.pengalamankerja " + " ( " + " id character varying(32) NOT NULL, "
				+ " id_datadiri character varying(32), " + " nama_institusi character varying, "
				+ " start character varying, " + " endd character varying, " + " deskripsi character varying, "
				+ " CONSTRAINT pengalamankerja_pkey PRIMARY KEY (id) " + " ) " + " WITH ( " + " OIDS=FALSE " + " ); "
				+ " ALTER TABLE public.pengalamankerja " + " OWNER TO admin; ";

		jdbcTemplate.update(query);
		return "<h3 style=\"color:#4CAF50\">Create Table WorkExperience : Done!<h3>";
	}

}

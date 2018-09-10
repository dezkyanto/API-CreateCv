package id.dezkyanto.javaspring.createcv.util;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class HelperDao {

	public static void setStringOrNull(PreparedStatement ps, int column, String value) throws SQLException {
		if (CheckUtil.isNotNull(value)) {
			ps.setString(column, value);
		} else {
			ps.setNull(column, java.sql.Types.VARCHAR);
		}
	}

	public static void setIntOrNull(PreparedStatement ps, int column, Integer value) throws SQLException {
		if (CheckUtil.isNotNull(value)) {
			ps.setInt(column, value);
		} else {
			ps.setNull(column, java.sql.Types.INTEGER);
		}
	}

	public static void setLongOrNull(PreparedStatement ps, int column, Long value) throws SQLException {
		if (CheckUtil.isNotNull(value)) {
			ps.setLong(column, value);
		} else {
			ps.setNull(column, java.sql.Types.BIGINT);
		}
	}

	public static void setDateOrNull(PreparedStatement ps, int column, Date value) throws SQLException {
		if (CheckUtil.isNotNull(value)) {
			java.util.Date d = new java.util.Date();
			d = value;
			java.sql.Date sd = new java.sql.Date(d.getTime());
			ps.setDate(column, sd);
		} else {
			ps.setNull(column, java.sql.Types.DATE);
		}
	}

	public static void setBigDecimalOrNull(PreparedStatement ps, int column, BigDecimal value) throws SQLException {
		if (CheckUtil.isNotNull(value)) {
			ps.setBigDecimal(column, value);
		} else {
			ps.setNull(column, java.sql.Types.BIGINT);
		}
	}

	public static void setDoubleOrNull(PreparedStatement ps, int column, Double value) throws SQLException {
		if (CheckUtil.isNotNull(value)) {
			ps.setDouble(column, value);
		} else {
			ps.setNull(column, java.sql.Types.DOUBLE);
		}
	}
}

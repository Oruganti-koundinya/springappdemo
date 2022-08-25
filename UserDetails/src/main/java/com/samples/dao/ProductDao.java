package com.samples.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.samples.entity.Product;

public class ProductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Product> getAllProducts() {

		return jdbcTemplate.query("select * fromproduct", new RowMapper<Product>() {

			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

				Product obj = new Product();
				obj.setId(rs.getLong(1));
				obj.setName(rs.getString(2));
				obj.setPrice(rs.getBigDecimal(3));
				return obj;
			}
		});

	}

	public Product getProductById(long id) {

		return jdbcTemplate.query("select * from product where id=" + id, new ResultSetExtractor<Product>() {

			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Product obj = new Product();
					obj.setId(rs.getLong(1));
					obj.setName(rs.getString(2));
					obj.setPrice(rs.getBigDecimal(3));
					return obj;
					
				}

				return null;
			}
		});

	}

	public void updateProduct(Product obj) {
		if (obj.getId() > 0) {
			String sql = "update product set name=?,price=? where id=?";
			jdbcTemplate.update(sql, obj.getName(), obj.getPrice(), obj.getId());
		} else {
			String sql = "insert into product (name,price) values (?,?)";
			jdbcTemplate.update(sql, obj.getName(), obj.getPrice());
		}
	}

}

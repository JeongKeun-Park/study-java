package com.app.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.app.configuration.Configuration;
import com.app.domain.vo.AdminVO;

public class AdminDAO {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
//	관리자 추가
	public void insert (AdminVO adminVO) {
		String query = "INSERT INTO TBL_ADMIN "
				+ "(ID, ADMIN_ACCOUNT, ADMIN_PASSWORD, ADMIN_NAME, ADMIN_PHONE, ADMIN_EMAIL) "
				+ "VALUES(SEQ_ADMIN.NEXTVAL, ?, '1234', ?, ?, ?)";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, adminVO.getAdminAccount());
			preparedStatement.setString(2, adminVO.getAdminName());
			preparedStatement.setString(3, adminVO.getAdminPhone());
			preparedStatement.setString(4, adminVO.getAdminEmail());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		
	}
	
//	관리자 전체 조회
	public ArrayList<AdminVO> selectAll () {
		ArrayList<AdminVO> admins = new ArrayList<AdminVO>();
		
		String query = "SELECT * "
				+ "FROM TBL_ADMIN "
				+ "ORDER BY ID";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				AdminVO admin = new AdminVO();
				
				admin.setId(resultSet.getLong(1));
				admin.setAdminAccount(resultSet.getString(2));
				admin.setAdminPassword(resultSet.getString(3));
				admin.setAdminName(resultSet.getString(4));
				admin.setAdminPhone(resultSet.getString(5));
				admin.setAdminEmail(resultSet.getString(6));
				
				admins.add(admin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return admins;
	}
//	관리자 중복 검사
	public boolean checkId (String account) {
		String query = "SELECT ID, ADMIN_ACCOUNT, ADMIN_NAME "
				+ "FROM TBL_ADMIN "
				+ "WHERE ADMIN_ACCOUNT = ?";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, account);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return false;
	}
	
	public Optional<AdminVO> checkIdOptional (String account) {
		AdminVO admin = null;
		String query = "SELECT * "
				+ "FROM TBL_ADMIN "
				+ "WHERE ADMIN_ACCOUNT = ?";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, account);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				admin = new AdminVO();
				
				admin.setId(resultSet.getLong(1));
				admin.setAdminAccount(resultSet.getString(2));
				admin.setAdminPassword(resultSet.getString(3));
				admin.setAdminName(resultSet.getString(4));
				admin.setAdminPhone(resultSet.getString(5));
				admin.setAdminEmail(resultSet.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return Optional.ofNullable(admin);
	}
//	삭제
	
	public void delete (Long id) {
		String query = "DELETE FROM TBL_ADMIN "
				+ "WHERE ID = ?";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setLong(1, id);
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
	public void setAdmin(AdminVO adminVO) {
		String query = "UPDATE TBL_ADMIN "
				+ "SET ADMIN_PASSWORD = ?, ADMIN_PHONE = ?, ADMIN_EMAIL = ? "
				+ "WHERE ID = ?";
		
		connection =Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, adminVO.getAdminPassword());
			preparedStatement.setString(2, adminVO.getAdminPhone());
			preparedStatement.setString(3, adminVO.getAdminEmail());
			preparedStatement.setLong(4, adminVO.getId());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
}

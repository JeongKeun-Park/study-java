package com.app.domain.dao;

import java.io.ObjectInputFilter.Config;
import java.lang.StackWalker.Option;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.configuration.Configuration;
import com.app.domain.dto.FeedDTO;
import com.app.domain.vo.FeedVO;

public class FeedDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	피드 목록 추가
	public void insert(FeedVO feedVO) {
		String query = "INSERT INTO TBL_FEED " + "(ID, CREATE_DATE, UPDATE_DATE, FEED_CONTENT, MEMBER_ID) "
				+ "VALUES(SEQ_FEED.NEXTVAL, SYSDATE, SYSDATE, ?, ?)";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, feedVO.getFeedContent());
			preparedStatement.setLong(2, feedVO.getMemberId());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	피드 조회
	public Optional<FeedDTO> select(Long id) {
		FeedDTO feed = null;

		String query = "SELECT " + "F.ID, F.CREATE_DATE, F.UPDATE_DATE , F.FEED_CONTENT , F.MEMBER_ID , "
				+ "M.MEMBER_NAME " + "FROM TBL_MEMBER M " + "JOIN TBL_FEED F " + "ON M.ID = F.MEMBER_ID AND F.ID = ?";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				feed = new FeedDTO();

				feed.setId(resultSet.getLong(1));
				feed.setCreateDate(resultSet.getString(2));
				feed.setUpdateDate(resultSet.getString(3));
				feed.setFeedContent(resultSet.getString(4));
				feed.setMemberId(resultSet.getLong(5));
				feed.setMemberName(resultSet.getString(6));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return Optional.ofNullable(feed);
	}

//  피드 수정
	public void setFeed(FeedDTO feedDTO) {
		String query = "UPDATE TBL_FEED " + "SET FEED_CONTENT = ? " + "WHERE MEMBER_ID = ? AND ID = ?";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, feedDTO.getFeedContent());
			preparedStatement.setLong(2, feedDTO.getMemberId());
			preparedStatement.setLong(3, feedDTO.getId());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

	}

//	삭제
	
	public void delete (Long id) {
		String query = "DELETE FROM TBL_FEED "
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

//	원하는 회원의 피드 목록 조회
	public List<FeedDTO> selectMember() {
		List<FeedDTO> feeds = new ArrayList<FeedDTO>();
		FeedDTO feed = null;
		String query = "SELECT " + "F.ID ,F.MEMBER_ID, M.MEMBER_NAME , F.CREATE_DATE ,F.UPDATE_DATE ,F.FEED_CONTENT "
				+ "FROM TBL_MEMBER M " + "JOIN TBL_FEED F " + "ON M.ID = F.MEMBER_ID " + "ORDER BY ID";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				feed = new FeedDTO();

				feed.setId(resultSet.getLong(1));
				feed.setMemberId(resultSet.getLong(2));
				feed.setMemberName(resultSet.getString(3));
				feed.setCreateDate(resultSet.getString(4));
				feed.setUpdateDate(resultSet.getString(5));
				feed.setFeedContent(resultSet.getString(6));

				feeds.add(feed);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return feeds;

	}

}

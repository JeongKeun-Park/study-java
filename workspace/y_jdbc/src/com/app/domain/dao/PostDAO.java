package com.app.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.configuration.Configuration;
import com.app.domain.dto.PostDTO;
import com.app.domain.vo.PostVO;

public class PostDAO {
   private Connection connection;
   private PreparedStatement preparedStatement;
   private ResultSet resultSet;
   
//   추가하기
   public void insert(PostVO postVO) {
      String query = "INSERT INTO TBL_POST "
            + "(ID, POST_TITLE, POST_CONTENT, MEMBER_ID) "
            + "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
      
      connection = Configuration.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, postVO.getMemberId());
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

//   조회하기
   public Optional<PostDTO> selectById(Long id) {
      PostDTO post = null;
      String query = "SELECT "
            + "P.ID, P.POST_TITLE, P.POST_CONTENT, P.POST_READ_COUNT, P.CREATED_DATE, P.UPDATED_DATE, "
            + "P.MEMBER_ID, M.MEMBER_NAME "
            + "FROM TBL_MEMBER M "
            + "JOIN TBL_POST P "
            + "ON M.ID = P.MEMBER_ID AND P.ID = ?";
      
      connection = Configuration.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            post = new PostDTO();
            
            post.setId(resultSet.getLong(1));
            post.setPostTitle(resultSet.getString(2));
            post.setPostContent(resultSet.getString(3));
            post.setPostReadCount(resultSet.getInt(4));
            post.setCreatedDate(resultSet.getString(5));
            post.setUpdatedDate(resultSet.getString(6));
            post.setMemberId(resultSet.getLong(7));
            post.setMemberName(resultSet.getString(8));
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
      
      return Optional.ofNullable(post);
   }
   
//   조회수 증가
   public void updateCount(PostDTO postDTO) {
	   String query = "UPDATE TBL_POST "
	   		+ "SET POST_READ_COUNT = ? "
	   		+ "WHERE ID = ?";
	   
	   connection = Configuration.getConnection();
	   
	   try {
		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setInt(1, postDTO.getPostReadCount());
		preparedStatement.setLong(2, postDTO.getId());
		
		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
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
   
   
//   수정하기
   public void update (PostDTO postDTO) {
	   String query = "UPDATE TBL_POST "
	   		+ "SET POST_TITLE = ?, POST_CONTENT = ? "
	   		+ "WHERE ID = ?";
	   
	   connection = Configuration.getConnection();
	   
	   try {
		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, postDTO.getPostTitle());
		preparedStatement.setString(2, postDTO.getPostContent());
		preparedStatement.setLong(3, postDTO.getId());
		
		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
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
   
// 삭제하기
 public void delete(Long id) {
    String query = "DELETE FROM TBL_POST WHERE ID = ?";
    
    connection = Configuration.getConnection();
    try {
       preparedStatement = connection.prepareStatement(query);
       preparedStatement.setLong(1, id);
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
   
//   전체 조회하기
 public List<PostDTO> selectAll() {
	 List<PostDTO> arPostDTO = new ArrayList<PostDTO>();
	 PostDTO postDTO = null;
	 String query = "SELECT M.MEMBER_NAME , "
	 		+ "P.ID POST_ID, P.POST_TITLE, P.POST_CONTENT, P.POST_READ_COUNT, P.MEMBER_ID, P.CREATED_DATE "
	 		+ "FROM TBL_MEMBER M "
	 		+ "JOIN TBL_POST P "
	 		+ "ON M.ID = P.MEMBER_ID";
	 
	 connection = Configuration.getConnection();
	 
	 try {
		preparedStatement = connection.prepareStatement(query);
		
	resultSet = preparedStatement.executeQuery();
	
	while(resultSet.next()) {
		postDTO = new PostDTO();
		
		postDTO.setMemberName(resultSet.getString(1));
		postDTO.setId(resultSet.getLong(2));
		postDTO.setPostTitle(resultSet.getString(3));
		postDTO.setPostContent(resultSet.getString(4));
		postDTO.setPostReadCount(resultSet.getInt(5));
		postDTO.setMemberId(resultSet.getLong(6));
		postDTO.setCreatedDate(resultSet.getString(7));
		
		arPostDTO.add(postDTO);
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
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
	 return arPostDTO;
	 
 }
}


























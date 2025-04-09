package com.app.test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.domain.dao.MemberDAO;
import com.app.domain.dao.PostDAO;
import com.app.domain.dao.ReplyDAO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;
import com.app.domain.vo.ReplyVO;
import com.app.exception.member.DuplicateException;
import com.app.exception.member.LoginException;
import com.app.exception.post.PostNotFoundException;

public class Test {
   public static void main(String[] args) {
      MemberDAO memberDAO = new MemberDAO();
      PostDAO postDAO = new PostDAO();
      ReplyDAO replyDAO = new ReplyDAO();
      
//      회원가입 화면
      
//      필요한 정보들을 미리 만들어서 변수에 담아둔다.
//      String memberEmail = "hgd5555@naver.com";
//      String memberPassword = "5555";
//      String memberName = "홍길동";
//      int memberAge = 20;
//      String memberGender = "여자";
////      MemberVO 객체를 불러오고
//      MemberVO memberVO = new MemberVO();
////      위에서 미리 만들어둔 정보를 담아준다.
//      memberVO.setMemberEmail(memberEmail);
//      memberVO.setMemberPassword(memberPassword);
//      memberVO.setMemberName(memberName);
//      memberVO.setMemberAge(memberAge);
//      memberVO.setMemberGender(memberGender);
//      
////      출력메소드로 확인한다
////      System.out.println(memberVO);
//      
////      insert메소드를 통해서 db에 전달한다.
//      memberDAO.insert(memberVO);
      
//      로그인
      
//      로그인에 필요한 email, password를 변수에 담아서 준비한다.
//      String memberEmail = "hgd5555@naver.com";
//      String memberPassword = "5555";
////    MemberVO 객체를 member로 생성한다.
//      MemberVO member = new MemberVO();
////      위에서 준비한 변수들을 memberVO객체의 필드값으로 설정한다
//      member.setMemberEmail(memberEmail);
//      member.setMemberPassword(memberPassword);
//      
////      밑의 출력메세지처럼 해도 되지만 해당 메소드의 값이 없다면 오류가 발생할 수도 있다.
////      System.out.println(memberDAO.selectByMemberEmailAndMemberPassword(member));
//      
////      null값일때 오류를 대체하기 위한 메세지를 출력하기 위해 orElseThrow메소드를 사용한다
////      LoginException 클래스를 만들어서 RuntimeException을 상속받고 
////      RuntimeException의 메소드중 메세지 출력 메소드를 재정의하여 아래처럼 사용한다.
//      member = memberDAO.selectByMemberEmailAndMemberPassword(member).orElseThrow(() -> {
//         throw new LoginException("로그인 실패");
//      });
////      출력메세지로 결과값을 확인.
//      System.out.println(member);
      
//      회원 조회
//      Long id = 1L;
//      System.out.println(memberDAO.selectById(id));
      
//      회원 수정
//      Long id = 1L;
//      MemberVO member = memberDAO.selectById(id);
//      
//      member.setMemberName("홍길동");
//      memberDAO.update(member);
      
//      회원 삭제
//      Long id = 1L;
//      MemberVO member = memberDAO.selectById(id);
//      
//      memberDAO.delete(member.getId());
      
//      회원 전체 조회

   // selectAll() 메서드가 List<MemberVO> 객체로 반환되기 때문에
   // forEach를 사용하여 리스트 안에 있는 각 MemberVO 객체에 대해 작업을 수행한다
//      memberDAO.selectAll().forEach((member) -> {
//         System.out.println(member);
//      });
      
//      이메일 중복검사
      String memberEmail = "hgd5555@naver.com1";
//      memberEmail값을 입력하고 MemberVO객체의 새로운 생성자인 foundMember에 담아준다.
      Optional<MemberVO> foundMember = memberDAO.selectByMemberEmail(memberEmail);
//      System.out.println(foundMember.isPresent());
      
      if(foundMember.isPresent()) {//조건식이 true일때는 foundMember객체를 출력해주고
    	  System.out.println(foundMember);
      }else{// false일떄는 Exception 메세지를 출력한다.
    	  foundMember.orElseThrow(() -> {throw new DuplicateException("중복된 아이디 입니다.");});
      };
      
      
      
//      게시글 추가
//      Long memberId = 21L;
//      MemberVO member = memberDAO.selectById(memberId);
//      PostVO post = new PostVO();
//      
//      post.setPostTitle("테스트 제목1");
//      post.setPostContent("테스트 내용1");
//      post.setMemberId(member.getId());
//      
//      postDAO.insert(post);
      
//      회원의 id번호를 변수에 담아준다
//      Long memberId = 21L;
////      selectById 메소드로 회원의 id번호로 회원을 조회한다.
//      MemberVO member = memberDAO.selectById(memberId);
////      PostVO객체 생성
//      PostVO post = new PostVO();
//      
//      post.setPostTitle("테스트 제목3");
//      post.setPostContent("테스트 내용3");
////      member객체의 id번호 가져와 PostVO객체의 memberId필드에 설정
//      post.setMemberId(member.getId());
////      위의 필드요소를 db에 보내어 insert한다
//      postDAO.insert(post);
      
//      selectById메소드의 반환값을 foundPost 객체에 담아준다
//      Optional<PostDTO> foundPost = postDAO.selectById(2222L);
////      foundPost가 값을 가지고 있다면 출력메세지를 실행한다.
////      foundPost.ifPresent((post) -> {
////         System.out.println(post);
////      });
//      
////      orElse는 값이 없을때 ()에 입력한 기본값을 반환한다.
////      PostDTO post = foundPost.orElse(new PostDTO());
////      System.out.println(post);
//      
////      orElseThrow는 예외처리를 위해서 사용한다.
//      PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException("게시글 조회 실패");});
//      System.out.println(post);
      
//      게시글 수정
//      Optional<PostDTO> foundPost = postDAO.selectById(1L);
//      PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException();});
//      PostVO postVO = new PostVO();
//      
//      post.setPostTitle("수정된 제목");
//      
//      postVO.setId(post.getId());
//      postVO.setPostTitle(post.getPostTitle());
//      postVO.setPostContent(post.getPostContent());
//      
//      postDAO.update(postVO);
      
//      게시글 삭제(작성한 게시글인지 검사)
//      Long memberId = 21L;
//      Long postId = 2L;
//      MemberVO member = memberDAO.selectById(memberId);
//      Optional<PostDTO> foundPost = postDAO.selectById(postId);
//      PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException();});
//      if(member.getId() == post.getMemberId()) {
//         postDAO.delete(post.getId());
//      }
      
//      게시글 전체 목록
//      postDAO.selectAll().forEach((post) -> {
//         System.out.println(post);
//      });
      
//      댓글 작성
//      MemberVO member = memberDAO.selectById(21L);
//      Optional<PostDTO> foundPost = postDAO.selectById(1L);
//      PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException();});
//      ReplyVO reply = new ReplyVO();
//      
//      reply.setMemberId(member.getId());
//      reply.setPostId(post.getId());
//      reply.setReplyContent("테스트 댓글1");
//      
//      replyDAO.insert(reply);
      
//      전체 목록(전체 목록 중, 내가 작성한 댓글인지 검사, 이후 수정 및 삭제 테스트)
//      ReplyVO reply = new ReplyVO();
//      MemberVO member = memberDAO.selectById(21L);
//      Optional<PostDTO> foundPost = postDAO.selectById(1L);
//      System.out.println(foundPost);
////      -----------------------------------------------------------------------------------
//      PostDTO post = foundPost.orElseThrow(() -> {throw new PostNotFoundException();});
//      System.out.println(post);
//      ArrayList<ReplyDTO> replies = 
//            (ArrayList<ReplyDTO>) replyDAO.selectAll(post.getId()).stream()
//               .filter((replyDTO) -> replyDTO.getMemberId() == member.getId())
//                  .collect(Collectors.toList());
////    -------------------------------------------------------------------------------------      
////      System.out.println(replies);
//      replies.get(0).setReplyContent("수정된 댓글");
//      
//      reply.setId(replies.get(0).getId());
//      reply.setReplyContent(replies.get(0).getReplyContent());
//      
////      수정
////      replyDAO.update(reply);
//      
////      삭제
//      replyDAO.delete(replies.get(0).getId());
      

   }
}
























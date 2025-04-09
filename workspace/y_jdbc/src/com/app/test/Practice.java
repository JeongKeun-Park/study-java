package com.app.test;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.domain.dao.AdminDAO;
import com.app.domain.dao.FeedDAO;
import com.app.domain.dao.MemberDAO;
import com.app.domain.dao.PostDAO;
import com.app.domain.dao.ReplyDAO;
import com.app.domain.dto.FeedDTO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.vo.AdminVO;
import com.app.domain.vo.FeedVO;
import com.app.domain.vo.MemberVO;
import com.app.domain.vo.PostVO;
import com.app.domain.vo.ReplyVO;
import com.app.exception.feed.FeedNotFoundException;
import com.app.exception.member.DuplicateException;
import com.app.exception.member.LoginException;
import com.app.exception.post.NotFoundMemberIdException;

public class Practice {
	public static void main(String[] args) {
//		FeedDAO feedDAO = new FeedDAO();
//		FeedVO feedVO = new FeedVO();
//		FeedDTO feedDTO = new FeedDTO();
//		MemberVO member = new MemberVO();
//		MemberDAO memberDAO = new MemberDAO();
//		피드 추가
//		String content = "테스트 내용4";
//		Long memberId = 1L;
//		
//		feedVO.setFeedContent(content);
//		feedVO.setMemberId(memberId);
//		
//		feedDAO.insert(feedVO);
//		
//		System.out.println(feedVO);

//		원하는 회원 조회
//		Long memberID = 1L;
//		Long feedID = 0L;
//		String email = "hgd5555@naver.com";
//		String password = "5555";
//		
//		member.setMemberEmail(email);
//		member.setMemberPassword(password);
//		
//		Optional<MemberVO> loginMember = memberDAO.selectByMemberEmailAndMemberPassword(member);
//		
//		member = loginMember.orElseThrow(()->{throw new LoginException("로그인 실패");});
//		
//		List<FeedDTO> feeds = feedDAO.selectMember();
//		
//		
////		feeds.forEach(System.out::println);
//		
//		
//		Long targetMemberId = member.getId();
//		String content = "바뀐내용 11";
//		
//		
//		feeds.forEach((feed) -> {
//			if(feed.getMemberId().equals(targetMemberId)) {
////				System.out.println(feed);
//				if(feed.getId() == feedID) {
//					feed.setFeedContent(content);
//					
//					feedDAO.setFeed(feed);
//					System.out.println(feed);
//				}
//			}
//			
//		});

//		관리자 회원가입
//		AdminDAO adminDAO = new AdminDAO();
//		

//		
////		System.out.println(admin);
//		
//		adminDAO.insert(admin);

//		관리자 전체 조회
//		adminDAO.selectAll().forEach(System.out::println);

//		관리자 중복 검사 후 회원가입

//		AdminVO admin = new AdminVO();
//
//		String adminAccount = "pjk12312344";
//		String name = "박정근";
//		String phone = "01074478469";
//		String email = "pjk1234@naver.com";
//
//		admin.setAdminAccount(adminAccount);
//		
//		if (adminDAO.checkId(adminAccount)) {
//			System.out.println("중복");
//			return;
//		}
//		
//		System.out.println("중복아님");
//		admin.setAdminName(name);
//		admin.setAdminPhone(phone);
//		admin.setAdminEmail(email);
//		
//		adminDAO.insert(admin);
//		Optional로 관리자 중복 검사 후 회원가입
		
//		String adminAccount = "pjk12312344";
//		Optional<AdminVO> foundAdmin = adminDAO.checkIdOptional(adminAccount);
//		if(foundAdmin.isPresent()) {
//			throw new DuplicateException("중복된 아이디");
//		}
//		System.out.println("사용 가능한 아이디");
		
//		관리자 삭제
//		Long target = 1L;
//		
////		adminDAO.delete(target);
//		
//		
//		target = 2L;
//		String newPassword = "123123";
//		String newPhone = "01011112222";
//		String newEmail = "jdy1234@gmail.com";
//		
//		AdminVO admin = new AdminVO();
//		
//		admin.setAdminPassword(newPassword);
//		admin.setAdminPhone(newPhone);
//		admin.setAdminEmail(newEmail);
//		admin.setId(target);
//		
//		adminDAO.setAdmin(admin);
		
//		MemberDAO memberDAO = new MemberDAO();
		
		
//		회원가입 화면
//		String email = "hds1234@gamil.com";
//		
////		이메일 중복검사
//		Optional<MemberVO> checkMember = memberDAO.selectByMemberEmail(email);
//		
//		if(checkMember.isPresent()) {
//			System.out.println("중복된 아이디 입니다.");
//			return;
//		}else {
//			System.out.println("사용 가능한 아이디 입니다.");
//		};
		
//		String password = "123123";
//		String name= "한동석";
//		int age = 10;
//		String gender = "여자";
//		
//		member.setMemberEmail(email);
//		member.setMemberPassword(password);
//		member.setMemberName(name);
//		member.setMemberAge(age);
//		member.setMemberGender(gender);
//		
//		memberDAO.insert(member);
//		
////		로그인
		
//		MemberVO member = new MemberVO();
//		email = "hds1234@gamil.com";
//		member.setMemberEmail(email);
//		member.setMemberPassword(password);
//		
//		
//		Optional<MemberVO> loginMember = memberDAO.selectByMemberEmailAndMemberPassword(member);
//		if(loginMember.isPresent()) {
//			System.out.println(loginMember);			
//		} else {
//			loginMember.orElseThrow(() -> {throw new LoginException("아이디와 비밀번호를 확인해주세요");});
//		}
		
		
//		회원조회
//		Optional<MemberVO> targetMember = memberDAO.selectByMemberEmail(email);
//		if(targetMember.isPresent()) {
//			System.out.println(targetMember);
//		}else {
//			targetMember.orElseThrow(() -> {throw new LoginException("존재하지 않는 이메일 입니다.");});
//		}
		
//		회원수정
//		MemberVO member = new MemberVO();
//		
//		name = "조승찬";
//		age = 15;
//		gender = "여자";
//		Long id = 3L;
//		
//		member.setMemberName(name);
//		member.setMemberAge(age);
//		member.setMemberGender(gender);
//		member.setId(id);
//		
//		memberDAO.update(member);
		
//		회원삭제
//		MemberVO member = new MemberVO();
//		
//		memberDAO.delete(3L);
		
//		회원전체조회
//		List<MemberVO> members = memberDAO.selectAll();
//		
//		members.forEach(System.out::println);
		
		
//		게시글 추가
//		MemberVO member = new MemberVO();
//		
//		email = "dyj1234@gamil.com";
//		password = "1234";
//		
//		member.setMemberEmail(email);
//		member.setMemberPassword(password);
		
//		MemberVO loginMember = new MemberVO();
//		orElseThrow를 사용하면 값이 존재할때 Optional객체가 사라지고 제네릭 안의 일반객체가 반환된다.
//		loginMember = memberDAO.selectByMemberEmailAndMemberPassword(member).orElseThrow(()->new NotFoundMemberIdException());
//		PostDAO postDAO = new PostDAO();
//		
//		String title = "제목3";
//		String content = "내용3";
//		Long memberId = loginMember.getId();
		
//		PostVO post = new PostVO();
//		
//		post.setPostTitle(title);
//		post.setPostContent(content);
//		post.setMemberId(memberId);
//		
//		postDAO.insert(post);
		
//		게시글 조회
//		Long postId = 1L;
//		
//		PostDTO postDTO = new PostDTO();
//		postDTO = postDAO.selectById(postId).orElseThrow(()->new NotFoundMemberIdException("존재하지 않는 게시물 입니다."));
//
//		postDTO.setPostReadCount(postDTO.getPostReadCount()+1);
//		postDTO.setId(postId);
//		
//		postDAO.updateCount(postDTO);
		
//		게시글 전체 조회
//		List<PostDTO> posts =  postDAO.selectAll();
//		posts.forEach(System.out::println);
		
//		게시글 수정
//		Long targetPostId = 2L;
//		String newTitle = "제목수정1";
//		String newContent = "내용수정1";
//		System.out.println(loginMember);
//		Long loginMemberId = loginMember.getId();
//		
//		posts.forEach((post) -> {
//			if(post.getMemberId() == loginMemberId) {
//				if(post.getId() == targetPostId) {
//					post.setPostTitle(newTitle);
//					post.setPostContent(newContent);
//					post.setId(targetPostId);
//					
//					postDAO.update(post);
//				}
//			}
//		});
		
//		게시글 삭제
//		posts.forEach((post) -> {
//			if(post.getMemberId() == loginMemberId) {
//				if(post.getId() == targetPostId) {
//					postDAO.delete(post.getId());
//				}
//			}
//		});
		
		
//		댓글 작성
		ReplyDAO replyDAO = new ReplyDAO();
		MemberDAO memberDAO = new MemberDAO();
		PostDAO postDAO = new PostDAO();
//		
		MemberVO member = new MemberVO();
		String email = "dyj1234@gamil.com";
		String password = "1234";
		
		member.setMemberEmail(email);
		member.setMemberPassword(password);
//		
//		
		MemberVO loginMember = new MemberVO();
		loginMember = memberDAO.selectByMemberEmailAndMemberPassword(member).orElseThrow(()->new LoginException("아이디와 비밀번호를 확인해주세요"));
////		System.out.println(loginMember);
//		
		PostDTO post = new PostDTO();
		Long postId = 3L;
		post = postDAO.selectById(postId).orElseThrow(()->new NotFoundMemberIdException("존재하지 않는 게시물"));
		
//		ReplyVO reply = new ReplyVO();
//		String content = "댓글6";
//		Long replyPostId = post.getId();
//		Long memberId = loginMember.getId();
//		
//		reply.setReplyContent(content);
//		reply.setPostId(replyPostId);
//		reply.setMemberId(memberId);
//		
//		replyDAO.insert(reply);
		
//		댓글 전체 목록
		ReplyDTO replyDTO = new ReplyDTO();
		ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
		replies =  replyDAO.selectAll(post.getId());
		Long loginMemberId = loginMember.getId();
		replies.forEach((reply) -> {
			if(reply.getMemberId() == loginMemberId) { 
				System.out.println(reply);
			}
		});
	}
}

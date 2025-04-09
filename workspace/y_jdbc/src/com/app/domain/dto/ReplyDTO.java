package com.app.domain.dto;

import java.util.Objects;

public class ReplyDTO {
	private Long id;
	private String replyContent;
	private Long postId;
	private Long memberId;
	private String createdDate;
	private String updatedDate;
	private String memberName;
	
	public ReplyDTO() {;}

	public Long getId() {
		return id;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public Long getPostId() {
		return postId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", replyContent=" + replyContent + ", postId=" + postId + ", memberId=" + memberId
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", memberName=" + memberName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyDTO other = (ReplyDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

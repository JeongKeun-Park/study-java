package com.app.domain.dto;

import java.util.Objects;

public class FeedDTO {
	private Long id;
	private String createDate;
	private String updateDate;
	private String feedContent;
	private Long memberId;
	private String memberName;
	
	public FeedDTO() {;}

	public Long getId() {
		return id;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public String getFeedContent() {
		return feedContent;
	}

	public Long getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public void setFeedContent(String feedContent) {
		this.feedContent = feedContent;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "FeedDTO [id=" + id + ", createDate=" + createDate + ", updateDate=" + updateDate + ", feedContent="
				+ feedContent + ", memberId=" + memberId + ", memberName=" + memberName + "]";
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
		FeedDTO other = (FeedDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

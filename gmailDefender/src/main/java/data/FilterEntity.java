package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;

@Entity(name = "user")
@Table(name = "USER")
public class FilterEntity {

	

@Id()
@Column(name = "ID_")
@GeneratedValue(strategy = GenerationType.AUTO)	
private Long filterId;

@Column(name = "FILTERNAME_", nullable = false)
private String filterName;

@Column(name = "SUBJECT_", nullable = false)
private String subject;
@Column(name = "FROM_", nullable = true)
@Email
private String from;

@Column(name = "TO_", nullable = true)
@Email
private String to;


@Column(name = "HASTHEWORDS_", nullable = false)
private String hasTheWords;





public FilterEntity() {
	
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public String getHasTheWords() {
	return hasTheWords;
}

public void setHasTheWords(String hasTheWords) {
	this.hasTheWords = hasTheWords;
}

public String getFilterName() {
	return filterName;
}

public void setFilterName(String filterName) {
	this.filterName = filterName;
}

public Long getFilterId() {
	return filterId;
}

public void setFilterId(Long filterId) {
	this.filterId = filterId;
}



@Override
public String toString() {
	return "FilterEntity [filterName=" + filterName + ", filterId=" + filterId + "]";
}



}

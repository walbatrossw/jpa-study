package com.doubles.jpastudy;

import javax.persistence.*;
import java.util.Date;

//@Entity
// 유니크 제약조건 추가
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"} )})
public class Member {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME", nullable = false, length = 10) // 필수입력(null 허용X), 길이는 10자
    private String username;

    @Column(name = "AGE")
    private Integer age;

    @Enumerated(EnumType.STRING)    // enum을 사용하려면 @Enumerated 어노테이션을 사용
    @Column(name = "ROLE_TYPE")
    private RoleType roleType;      // enum을 사용해서 회원의 타입을 구분, 일반회원(USER)/관리자(ADMIN)

    @Temporal(TemporalType.TIMESTAMP)   // 자바의 날짜타입은 @Temporal 어노테이션을 사용
    @Column(name = "CREATE_DATE")
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;

    @Lob    // CLOB, BLOB타입을 매핑
    @Column(name = "DESCRIPTION")
    private String description; // 회원을 설명하는 필드는 길이 제한이 없음

    // GETTER SETTER
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

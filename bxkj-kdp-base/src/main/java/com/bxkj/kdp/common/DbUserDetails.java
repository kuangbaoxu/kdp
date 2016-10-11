package com.bxkj.kdp.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class DbUserDetails implements UserDetails {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String userId;
    private Integer deptParentId;
    private Integer deptId;
    private String email;
    private String title;
    private String telephone;
    private String qq;
    private int status;
    private String userType;
    
    private String userAuthority;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<Authority> roles = new ArrayList<Authority>();

        Authority authority = new Authority();
        authority.setAuthority(userAuthority);
        roles.add(authority);

        return roles;
    }

    public static class Authority implements GrantedAuthority {
        private static final long serialVersionUID = 1L;

        private String authority;

        public void setAuthority(String s) {
            this.authority = s;
        }

        @Override
        public String getAuthority() {
            return this.authority;
        }

    }
    
    @Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserAuthority() {
		return userAuthority;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public void setUserAuthority(String userAuthority) {
		this.userAuthority = userAuthority;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.status == 0;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public Integer getDeptParentId() {
		return deptParentId;
	}

	public void setDeptParentId(Integer deptParentId) {
		this.deptParentId = deptParentId;
	}
    
}
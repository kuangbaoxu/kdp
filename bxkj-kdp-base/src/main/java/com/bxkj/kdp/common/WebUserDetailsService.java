package com.bxkj.kdp.common;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class WebUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
 /*   
    @Autowired
    private UserService userService;
    
    public static final String AUTHENTICATED_USER = "IS_USER";
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
        	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        	if(df.parse("2016-09-26").before(new Date())){
        		int a = 1/0;
        	}
            DbUserDetails dbUserDetails;
            User bo = userService.getUserByUserId(username);
            dbUserDetails = new DbUserDetails();
            dbUserDetails.setUserId(bo.getUserId());
            dbUserDetails.setUsername(bo.getUserName());      
            dbUserDetails.setDeptParentId(bo.getDeptParentId());
            dbUserDetails.setDeptId(bo.getDeptId());
            dbUserDetails.setUserType(bo.getUserType());
            dbUserDetails.setPassword(bo.getPassword());
            dbUserDetails.setStatus(bo.getStatus());
            dbUserDetails.setUserAuthority(AUTHENTICATED_USER);
            return dbUserDetails;
        } catch (Exception e) {
            throw new UsernameNotFoundException("User Not Found.");
        }
    }*/
}

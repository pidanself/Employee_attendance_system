package com.ustb.rest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.ustb.rest.bean.UserBean;

@Path("users")
public class UserResource {
	private static Map<Integer,UserBean> userMap  = new HashMap<Integer,UserBean>();
	
    /** 
     * 增加 
     * @param user 
     */  
    @POST  
    @Consumes(MediaType.APPLICATION_JSON)  
    public List<UserBean> createUser(UserBean user)  
    {  
        userMap.put(user.getUserId(), user );  
        return getAllUsers(); 
    }  
	
    /** 
     * 删除 
     * @param id 
     */  
    @DELETE  
    @Path("{id}")  
    public List<UserBean> deleteUser(@PathParam("id")int id){  
        userMap.remove(id); 
        return getAllUsers(); 
    }  

    /** 
     * 修改 
     * @param user 
     */  
    @PUT  
    @Consumes(MediaType.APPLICATION_JSON)  
    public List<UserBean> updateUser(UserBean user){  
        userMap.put(user.getUserId(), user );  
        return getAllUsers(); 
    }  

    /** 
     * 根据id查询 
     * @param id 
     * @return 
     */  
    @GET  
    @Path("{id}")  
    @Produces(MediaType.APPLICATION_JSON)  
    public UserBean getUserById(@PathParam("id") int id){  
        UserBean u = userMap.get(id);  
        return u;  
    }  
	
	
	 /** 
     * 查询所有 
     * @return 
     */  
    @GET  
    @Produces(MediaType.APPLICATION_JSON)  
    public List<UserBean> getAllUsers(){       
        List<UserBean> users = new ArrayList<UserBean>();     
        users.addAll( userMap.values() );    
        return users;  
    }  
}

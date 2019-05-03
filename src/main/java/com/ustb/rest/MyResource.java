package com.ustb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ustb.rest.bean.*;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    
    /**
     * 方法处理 HTTP GET 请求。返回的对象以"application/json"媒体类型
     * 给客户端
     *
     * @return MyPojo 以 application/json 形式响应
     */
    @GET
    @Path("getjson")
    @Produces(MediaType.APPLICATION_JSON)
    public MyBean getPojoJson() {
        MyBean pojo = new MyBean();
        pojo.setName("pidan");
        pojo.setAge(20);
        return pojo;
    }
    
}

package com.enspyr.api.server;

import com.enspyr.api.client.MyEntity;
import com.enspyr.api.client.Test;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.ObjectifyService;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class TestService extends RemoteServiceServlet implements Test
{
	static {
        ObjectifyService.register(MyEntity.class);
    }
	
	private static final long serialVersionUID = 1L;

        @Override
        public MyEntity blah(MyEntity other)
        {
        	ofy().save().entity(other).now();    // async without the now()
            return other;
        }
}

package com.enspyr.api.server;



import com.enspyr.api.client.MyEntity;
import com.enspyr.api.client.Test;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class TestService extends RemoteServiceServlet implements Test
{
        private static final long serialVersionUID = 1L;

        @Override
        public MyEntity blah(MyEntity other)
        {
                return other;
        }
}

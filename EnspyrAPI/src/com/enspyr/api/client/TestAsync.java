package com.enspyr.api.client;

/*
 * $Id$
 */

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author Jeff Schnitzer
 */
public interface TestAsync
{
        void blah(MyEntity other, AsyncCallback<MyEntity> callback);
}

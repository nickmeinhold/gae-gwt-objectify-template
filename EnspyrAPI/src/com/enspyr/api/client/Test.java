package com.enspyr.api.client;

/*
 * $Id$
 */

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author Jeff Schnitzer
 */
@RemoteServiceRelativePath("test")
public interface Test extends RemoteService
{
	MyEntity blah(MyEntity other);
}

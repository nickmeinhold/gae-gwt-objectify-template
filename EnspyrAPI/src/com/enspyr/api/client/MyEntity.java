package com.enspyr.api.client;

/*
 * $Id$
 */

import java.io.Serializable;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.google.appengine.api.datastore.GeoPt;


/**
 * @author Jeff Schnitzer
 */
@Entity
public class MyEntity implements Serializable
{
        private static final long serialVersionUID = 1L;

        @Id long id;
        String blah;
        GeoPt geo;
        com.google.appengine.api.datastore.Key key;
        
        /** GAE & Objectify want this */
        public MyEntity() {}
        
        public String toString()
        {
                return this.getClass().getName() + "{"
                        + "geo=" + geo + ","
                        + "key=" + key + ","
                        + "}";
        }
}


/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.cross.rest.info;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

/**
 * Created by The eXo Platform SAS
 * Author : Canh Pham Van
 *          canhpv@exoplatform.com
 * Sep 19, 2012  
 */
public class RestInfoTest extends JerseyTest{

  public static final String PACKAGE_NAME = "org.exoplatform.cross.rest.info";
  private WebResource webResource;
  public RestInfoTest() throws Exception {
    super(new WebAppDescriptor.Builder(PACKAGE_NAME).contextPath("context").build());
  }  
  
  @Test
  public void testPlusOperation() throws UnsupportedEncodingException{
    webResource = resource().path("rest").path("addition").path("1").path("1");
    String response = webResource.get(String.class);
    assertEquals("You get: 2", response);    
  }
  
  @Test
  public void testSubOperation() throws UnsupportedEncodingException{
    webResource = resource().path("rest").path("substraction").path("2").path("1");
    String responseMsg = webResource.get(String.class);
    assertEquals("You get: 1", responseMsg);
  }

  @Test
  public void testMultiOperation() throws UnsupportedEncodingException{
    webResource = resource().path("rest").path("multiplication").path("2").path("2");
    String responseMsg = webResource.get(String.class);
    assertEquals("You get: 4", responseMsg);    
  }
  
  @Test
  public void testDivOperation() throws UnsupportedEncodingException{
    webResource = resource().path("rest").path("division").path("4").path("2");
    String responseMsg = webResource.get(String.class);
    assertEquals("You get: 2", responseMsg);    
  }
}

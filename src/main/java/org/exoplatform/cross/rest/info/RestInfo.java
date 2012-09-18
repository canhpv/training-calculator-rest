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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.exoplatform.services.rest.resource.ResourceContainer;

/**
 * Created by The eXo Platform SAS
 * Author : Canh Pham Van
 *          canhpv@exoplatform.com
 * Sep 17, 2012  
 */
//http://localhost:8080/ecmdemo/rest-ecmdemo/rest/1/2
@Path("/rest/")
public class RestInfo implements ResourceContainer{
@GET
@Path("/{a}/{b}")
@Produces("text/plain")
public String plusOperation(@PathParam("a")
String a, @PathParam("b")
String b) {
 return String.valueOf("You get: "+ (Integer.parseInt(a) + Integer.parseInt(b)));
}  
}
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

@Path("/rest/")
public class RestInfo implements ResourceContainer{
//http://localhost:8080/ecmdemo/rest-ecmdemo/rest/addition/1/2  
@GET
@Path("/addition/{a}/{b}")
@Produces("text/plain")
public String plusOperation(@PathParam("a")
String a, @PathParam("b")
String b) {
 return String.valueOf("You get: "+ (Integer.parseInt(a) + Integer.parseInt(b)));
}
//http://localhost:8080/ecmdemo/rest-ecmdemo/rest/substraction/1/2
@GET
@Path("/substraction/{a}/{b}")
@Produces("text/plain")
public String subOperation(@PathParam("a")
String a, @PathParam("b")
String b) {
 return String.valueOf("You get: "+ (Integer.parseInt(a) - Integer.parseInt(b)));
}

//http://localhost:8080/ecmdemo/rest-ecmdemo/rest/multiplication/1/2
@GET
@Path("/multiplication/{a}/{b}")
@Produces("text/plain")
public String multiOperation(@PathParam("a")
String a, @PathParam("b")
String b) {
 return String.valueOf("You get: "+ (Integer.parseInt(a) * Integer.parseInt(b)));
}

//http://localhost:8080/ecmdemo/rest-ecmdemo/rest/division/1/2
@GET
@Path("/division/{a}/{b}")
@Produces("text/plain")
public String divOperation(@PathParam("a")
String a, @PathParam("b")
String b) {
  if (Integer.parseInt(b) == 0){
    return String.valueOf("You get: NaN");
  }else{
    return String.valueOf("You get: "+ (Integer.parseInt(a) / Integer.parseInt(b)));
  }
}

}
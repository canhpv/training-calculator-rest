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

import java.text.SimpleDateFormat;
import java.util.Date;

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
//http://localhost:8080/ecmdemo/rest-ecmdemo/restcomparedate/2012-09-16/2012-09-17
@Path("/restcomparedate/")
public class RestCompareDate implements ResourceContainer{
@GET
@Path("/{a}/{b}")
@Produces("text/plain")
public String plusOperation(@PathParam("a")
String a, @PathParam("b")
String b) {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 String temp = "";
 try{
   a = "2012-09-16";
   b = "2012-09-17";
   Date startDate = sdf.parse(a);
   Date endDate = sdf.parse(b);
   if (startDate.compareTo(endDate)>1){
     temp = String.valueOf("Start date("+ a +") is greater than End date("+b+")");
   }else if (startDate.compareTo(endDate)<1){
     temp = String.valueOf("Start date("+ a +") is less than End date("+b+")");
   }else {
     temp = String.valueOf("Start date("+ a +") is as equal as End date("+b+")");
   }
 }catch (Exception e){
   
 } 
 return temp;
}  
}

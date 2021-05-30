package lab;
/***********************************************************************
 * Module:  element.java
 * Author:  余温
 * Purpose: Defines the Class element
 ***********************************************************************/

import java.util.*;

/** @pdOid 899aca94-7600-4cfe-9632-d75b7f4de64f */
public class element {
   /** @pdOid 62cf9cf3-f8be-4ea9-924b-9195bd133e8a */
   public short element_id;
   /** @pdOid 48f3e5db-3a54-4aaa-bb70-e367d69c5520 */
   public String class_id;
   /** @pdOid dcc255c0-479a-4e8b-a167-1b947cfc6cb0 */
   public String name;
   /** @pdOid 99d14caa-4cc4-444e-a5e7-0add51b16610 */
   public String remark;
   
   /** @pdOid 67013bf1-4e16-458e-853f-bb8a3ab0cb71 */
   public short getElement_id() {
      return element_id;
   }
   
   /** @param newElement_id
    * @pdOid fa7b243d-06e2-4550-b45c-ef54d0994ca3 */
   public void setElement_id(short newElement_id) {
      element_id = newElement_id;
   }
   
   /** @pdOid 3ff4a608-5ace-4092-8542-08c7cead3d7c */
   public String getClass_id() {
      return class_id;
   }
   
   /** @param newClass_id
    * @pdOid e961242b-318e-4c5c-9c13-d8d528c0171c */
   public void setClass_id(String newClass_id) {
      class_id = newClass_id;
   }
   
   /** @pdOid 19019050-98cc-406b-94fb-d3f830c13729 */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 32dbdc43-affa-4cad-add9-44ad57d36bb7 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 910ae8b7-87e1-46d6-95b5-db89969819fa */
   public String getRemark() {
      return remark;
   }
   
   /** @param newRemark
    * @pdOid f7bd0709-91d9-4bd9-8831-1f2d21dc7a79 */
   public void setRemark(String newRemark) {
      remark = newRemark;
   }

}
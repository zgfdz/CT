package lab;

/***********************************************************************

 * Module:  regular_expression.java
 * Author:  余温
 * Purpose: Defines the Class regular_expression
 ***********************************************************************/

import java.util.*;

/** @pdOid 1bf81865-f65d-4433-bb3d-b40e921163c0 */
public class regular_expression {
   /** @pdOid 00d5df91-d830-4b5a-a392-af56e9dc8da8 */
   public short head_element_id;
   /** @pdOid c39d202d-2d35-4033-bc64-fd8dd732b9ae */
   public String expression;
   /** @pdOid 7067bf34-a87f-43b0-86f6-3b90c2808a32 */
   public String lexcial_class;
   /** @pdOid 746925fe-6cdc-46be-903d-055b533894dc */
   public String remark;
   
   /** @pdOid 7b98718a-da1c-4b56-b5f2-012067a4cf86 */
   public short getHead_element_id() {
      return head_element_id;
   }
   
   /** @param newHead_element_id
    * @pdOid c3bb0c9b-e462-4d2c-a4d6-6c167e3b190a */
   public void setHead_element_id(short newHead_element_id) {
      head_element_id = newHead_element_id;
   }
   
   /** @pdOid 1d55b2b0-e327-44b4-8ee6-8187d5b769bb */
   public String getExpression() {
      return expression;
   }
   
   /** @param newExpression
    * @pdOid 8ead4019-7a4f-493a-a6bd-7843e78402bb */
   public void setExpression(String newExpression) {
      expression = newExpression;
   }
   
   /** @pdOid ae9a6184-16ab-436e-a68a-a467207e103a */
   public String getLexcial_class() {
      return lexcial_class;
   }
   
   /** @param newLexcial_class
    * @pdOid b43fbc01-13d6-44a5-b1a3-e2a66454b23c */
   public void setLexcial_class(String newLexcial_class) {
      lexcial_class = newLexcial_class;
   }
   
   /** @pdOid 97376555-c988-4873-8f32-ac645806707a */
   public String getRemark() {
      return remark;
   }
   
   /** @param newRemark
    * @pdOid 132f0932-4d5a-460c-a617-82e5af7266c1 */
   public void setRemark(String newRemark) {
      remark = newRemark;
   }

}
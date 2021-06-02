package lab;

/***********************************************************************
 * Module:  Lrtable.java
 * Author:  余温
 * Purpose: Defines the Class Lrtable
 ***********************************************************************/

import java.util.*;

/** @pdOid dbb0001d-f669-4d47-bbe2-7411e7274d0d */
public class LRTable {
   /** @pdOid bb02b3b6-3dd2-4b48-b637-5f1ff848d21a */
   public int state = 0;
   /** @pdOid 9d239cfa-166c-42c9-8c82-b7061abe6dfa */
   public java.lang.String opt;
   /** @pdOid ecda7646-394f-4e23-82ff-f8e2b0bd9815 */
   public java.lang.String actionType;
   /** @pdOid 66c20f04-d5c8-4caa-9c37-2a82db60a161 */
   public int actionID;
   /** @pdOid 4652e171-d56d-4823-a8f1-8f1879cc2813 */
   public int gotoID;
   
   /** @pdOid bc85b729-4944-4e8c-b8fd-bdd9969a3eba */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid 516ddac8-57ab-4e2e-8f1b-7f3e8fc9252d */
   public void setState(int newState) {
      state = newState;
   }
   
   /** @pdOid 1ec74c4e-06fa-45a8-8b86-63eb5ba575f6 */
   public java.lang.String getOpt() {
      return opt;
   }
   
   /** @param newOpt
    * @pdOid 12a39c04-af2f-4f1a-b3c1-86d28eb85029 */
   public void setOpt(java.lang.String newOpt) {
      opt = newOpt;
   }
   
   /** @pdOid 05eb200b-2f07-495b-b73c-e4cc778945a4 */
   public java.lang.String getActionType() {
      return actionType;
   }
   
   /** @param newActionType
    * @pdOid b0f149ee-7c99-4450-9b15-89e8828da22b */
   public void setActionType(java.lang.String newActionType) {
      actionType = newActionType;
   }
   
   /** @pdOid 84acfd73-f20a-4412-9ab6-02a30f2e9298 */
   public int getActionID() {
      return actionID;
   }
   
   /** @param newActionID
    * @pdOid a13826cf-a8a8-4c8b-9c73-a945f6945cc1 */
   public void setActionID(int newActionID) {
      actionID = newActionID;
   }
   
   /** @pdOid 35527999-739c-4f13-9832-aaaf7463090f */
   public int getGotoID() {
      return gotoID;
   }
   
   /** @param newGotoID
    * @pdOid 64624409-897e-49a9-ad50-9b9d389679e9 */
   public void setGotoID(int newGotoID) {
      gotoID = newGotoID;
   }
   
   
	public static Character getActionType(int s,String c) {
   return 's';   
}
public static Character getActionId(int s,String c) {
   return 's';   
}
public static int getGotoId(int top) {
  return 1;
}

}


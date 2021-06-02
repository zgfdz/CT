package lab;
/***********************************************************************

 * Module:  graph_edge.java
 * Author:  余温
 * Purpose: Defines the Class graph_edge
 ***********************************************************************/

import java.util.*;

/** @pdOid 9bf87045-3b2b-44c6-88bd-a85a94353a8e */
public class graph_edge {
   /** @pdOid b6b63cc8-bd16-4fd0-80ee-8023559aec41 */
   public int state;
   /** @pdOid 5613e10c-08f2-4d01-81ec-ff0de0643eb5 */
   public int driver_char_element_id;
   /** @pdOid e2f56796-cc64-4244-8493-588b5439cbc6 */
   public int next_state;
   
   /** @pdRoleInfo migr=no name=state_transition_graph assc=Reference_1 coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public state_transition_graph state_transition_graph;
   
   /** @pdOid 1d610adc-226f-4b8e-935a-efd93ba1d518 */
   public int getState() {
      return state;
   }
   
   /** @param newState
    * @pdOid d60ce7ec-1c4d-4399-92b7-bb0698b34a17 */
   public void setState(short newState) {
      state = newState;
   }
   
   /** @pdOid b40fe419-825c-40fb-a607-03c480ed74c0 */
   public int getDriver_char_element_id() {
      return driver_char_element_id;
   }
   
   /** @param newDriver_char_element_id
    * @pdOid 874cf603-ac0c-41c5-93c6-96f0ef95b3a1 */
   public void setDriver_char_element_id(short newDriver_char_element_id) {
      driver_char_element_id = newDriver_char_element_id;
   }
   
   /** @pdOid 019f6d1f-ca5a-4903-a98e-6e565333a25b */
   public int getNext_state() {
      return next_state;
   }
   
   /** @param newNext_state
    * @pdOid 96b7c8e3-51e4-4dc8-a835-54a973cb8a08 */
   public void setNext_state(short newNext_state) {
      next_state = newNext_state;
   }
   
   
   /** @pdGenerated default parent getter */
   public state_transition_graph getState_transition_graph() {
      return state_transition_graph;
   }
   
   /** @pdGenerated default parent setter
     * @param newState_transition_graph */
   public void setState_transition_graph(state_transition_graph newState_transition_graph) {
      if (this.state_transition_graph == null || !this.state_transition_graph.equals(newState_transition_graph))
      {
         if (this.state_transition_graph != null)
         {
            state_transition_graph oldState_transition_graph = this.state_transition_graph;
            this.state_transition_graph = null;
            oldState_transition_graph.removeGraph_edge(this);
         }
         if (newState_transition_graph != null)
         {
            this.state_transition_graph = newState_transition_graph;
            this.state_transition_graph.addGraph_edge(this);
         }
      }
   }

}
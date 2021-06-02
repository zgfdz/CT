package lab;
/***********************************************************************

 * Module:  state_transition_graph.java
 * Author:  余温
 * Purpose: Defines the Class state_transition_graph
 ***********************************************************************/

import java.util.*;

/** @pdOid d3d71c07-e20b-4c2c-8093-aea43a1a8de9 */
public class state_transition_graph {
   /** @pdOid f3e34500-679c-42a7-8931-a1669f566307 */
   public int graph_id;
   /** @pdOid 36e82e4d-7a91-41ce-82fe-cb472c65b796 */
   public int start_state;
   /** @pdOid e1470cf3-6db5-427a-9f96-ccd97c688747 */
   public int end_state;
   /** @pdOid c46e021c-ff05-4f7a-9119-754ac37994f8 */
   public String end_state_type;
   /** @pdOid c1a79f78-88e2-4365-91c5-ab3ff044cb07 */
   public String end_state_class;
   
   /** @pdRoleInfo migr=no name=graph_edge assc=Reference_1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<graph_edge> graph_edge;
   
   // construct
   state_transition_graph(int id){
	   graph_id=id;
	   start_state=0;
	   end_state=0;
   }
   
   /** @pdOid bfad2235-bb38-4677-9532-5b4a402d2f92 */
   public int getGraph_id() {
      return graph_id;
   }
   
   /** @param newGraph_id
    * @pdOid c0063c8e-cf86-4814-aa6b-025788174ca2 */
   public void setGraph_id(short newGraph_id) {
      graph_id = newGraph_id;
   }
   
   /** @pdOid 21655007-6918-42b8-bcc9-ea120d45db1d */
   public int getStart_state() {
      return start_state;
   }
   
   /** @param newStart_state
    * @pdOid cefda138-3e5f-49eb-a5f4-93531b0460cc */
   public void setStart_state(short newStart_state) {
      start_state = newStart_state;
   }
   
   /** @pdOid 7b148770-37df-4c55-8702-d899545fc535 */
   public int getEnd_state() {
      return end_state;
   }
   
   /** @param newEnd_state
    * @pdOid 2db9e84a-8c28-4e40-8732-422b2a7f10cb */
   public void setEnd_state(short newEnd_state) {
      end_state = newEnd_state;
   }
   
   /** @pdOid 15f8a5ef-35bf-41ba-b353-1d17b20fa3d2 */
   public String getEnd_state_type() {
      return end_state_type;
   }
   
   /** @param newEnd_state_type
    * @pdOid 2ea5082b-4955-4935-b7da-27a5ec46a5e2 */
   public void setEnd_state_type(String newEnd_state_type) {
      end_state_type = newEnd_state_type;
   }
   
   /** @pdOid dd90c4ef-8b10-4e6e-9056-ba59238bfc06 */
   public String getEnd_state_class() {
      return end_state_class;
   }
   
   /** @param newEnd_state_class
    * @pdOid 21d3ff1f-5a49-462e-8584-51e37a1cce23 */
   public void setEnd_state_class(String newEnd_state_class) {
      end_state_class = newEnd_state_class;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<graph_edge> getGraph_edge() {
      if (graph_edge == null)
         graph_edge = new java.util.HashSet<graph_edge>();
      return graph_edge;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGraph_edge() {
      if (graph_edge == null)
         graph_edge = new java.util.HashSet<graph_edge>();
      return graph_edge.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGraph_edge */
   public void setGraph_edge(java.util.Collection<graph_edge> newGraph_edge) {
      removeAllGraph_edge();
      for (java.util.Iterator iter = newGraph_edge.iterator(); iter.hasNext();)
         addGraph_edge((graph_edge)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGraph_edge */
   public void addGraph_edge(graph_edge newGraph_edge) {
      if (newGraph_edge == null)
         return;
      if (this.graph_edge == null)
         this.graph_edge = new java.util.HashSet<graph_edge>();
      if (!this.graph_edge.contains(newGraph_edge))
      {
         this.graph_edge.add(newGraph_edge);
         newGraph_edge.setState_transition_graph(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldGraph_edge */
   public void removeGraph_edge(graph_edge oldGraph_edge) {
      if (oldGraph_edge == null)
         return;
      if (this.graph_edge != null)
         if (this.graph_edge.contains(oldGraph_edge))
         {
            this.graph_edge.remove(oldGraph_edge);
            oldGraph_edge.setState_transition_graph((state_transition_graph)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGraph_edge() {
      if (graph_edge != null)
      {
         graph_edge oldGraph_edge;
         for (java.util.Iterator iter = getIteratorGraph_edge(); iter.hasNext();)
         {
            oldGraph_edge = (graph_edge)iter.next();
            iter.remove();
            oldGraph_edge.setState_transition_graph((state_transition_graph)null);
         }
      }
   }

}
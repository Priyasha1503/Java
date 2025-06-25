//https://leetcode.com/problems/clone-graph/

import java.util.*;
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;sd
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
//USING UNDIRECTEDGRAPHNODE BUILTIN CLASS..BUT SINCE KEETCODE DIDNT ALLOW THAT, WE HAVE WRITTEN AN OTHER CODE ,BY THE CLASSES THEY HAVE CREATED...
/*class Solution {
    public Node cloneGraph(Node node) {
        //we use DFS here, bust we cannot solve levl by level i.e,we cannot do BFS..
        // A NODE IS NOTHING BUT ADDRESS
        Map <Integer,UndirectedGraphNode> map=new HashMap<>();
        //HASHMAP IS USED TO STORE EVERYNODE'S ADJ NODES,SO THAT WE can stop multiple calculations to visit to the same node for the proces...
        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node)
        {
             //this is to check whether the cloning is done
            return clone(node);//this creates a new refernce copy for the user sended node - basically,it creates clone
        }
        public UndirectedGraphNode clone(UndirectedGraphNode node)
        {
            if(node==null)//empty graph
            {
                return null;
            }
            if(map.containsKey(node.val))//to check whether the value if there or not,so thta we do not insert a duplicate operation 
            {
                return map.get(node.val);
            }
            UndirectedGraphNode clone = new UndirectedGraphNode(node.val);
            map.put(clone.val,clone);
            for(UndirectedGraphNode neighbour:node.neighbours)
            {
                clone.neighbours.add(clone(neighbour));
            }
            return clone;

        }
    }
}*/
public class Solution
{
    public Node cloneGraph (Node node)
    {
        if(node==null) return null;
        Map<Node,Node> visited = new HashMap<>();//if every vertex is visited and that vertex's clone is created or not --- original node:clone node
        return cloneGraphImp(node,visited);
    }
    public Node cloneGraphImp(Node node,Map<Node,Node> visited)
    {
        Node copy = new Node(node.val);//created clone node or copy node
        visited.put(node,copy); //original node:clone node
        for(Node neighbour:node.neighbors) //node.neighbours is the arraylist contianing nodes adj nodes
        {
            if(visited.containsKey(neighbour))
            {
                //Insertion
                copy.neighbors.add(visited.get(neighbour));
            }
            else
            {
                Node neighbourCopy = cloneGraphImp(neighbour,visited);//creating memory
                copy.neighbors.add(neighbourCopy);

            }


        }
        return copy;
    }
}

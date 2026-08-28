class PrefixTree {
    class Node{
        Node[] links=new Node[26];
        boolean flag=false;

        private boolean containsLink(char ch){
            return this.links[ch-'a']!=null;
        }
        private Node getLink(char ch){
            return this.links[ch-'a'];
        }
    }
    Node root;

    public PrefixTree() {
         root=new Node();
    }

    public void insert(String word) {
        Node node=root;
        for(char ch : word.toCharArray()){
            if(!node.containsLink(ch)){
                node.links[ch-'a']=new Node();
            }
            node=node.getLink(ch);
        }
        node.flag=true;
    }

    public boolean search(String word) {
        Node node=root;
        for(char ch : word.toCharArray()){
            if(!node.containsLink(ch)){
                return false;
            }
            node=node.getLink(ch);
        }
        return node.flag;
    }

    public boolean startsWith(String prefix) {
        Node node=root;
        for(char ch : prefix.toCharArray()){
            if(!node.containsLink(ch)){
                return false;
            }
            node=node.getLink(ch);
        }
        return true;
    }
}

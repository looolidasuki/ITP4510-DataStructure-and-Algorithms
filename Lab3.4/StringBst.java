public class StringBst {
    private StringBstNode root;
    
    public StringBst() {
        root = null;
    }
    
    // Add a node to the BST
    public void addNode(String data) {
        root = addNodeRecursive(root, data);
    }
    
    private StringBstNode addNodeRecursive(StringBstNode node, String data) {
        if (node == null) {
            return new StringBstNode(data);
        }
        
        if (data.compareTo(node.data) < 0) {
            node.left = addNodeRecursive(node.left, data);
        } else if (data.compareTo(node.data) > 0) {
            node.right = addNodeRecursive(node.right, data);
        }
        // If equal, don't add (no duplicates)
        
        return node;
    }
    
    // Search for a string in the BST
    public String search(String target) {
        return searchRecursive(root, target);
    }
    
    private String searchRecursive(StringBstNode node, String target) {
        if (node == null) {
            return null;
        }
        
        int cmp = target.compareTo(node.data);
        
        if (cmp == 0) {
            return node.data;
        } else if (cmp < 0) {
            return searchRecursive(node.left, target);
        } else {
            return searchRecursive(node.right, target);
        }
    }
}

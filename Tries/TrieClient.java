package Tries;



public class TrieClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Trie trie=new Trie();
		
		trie.addWord("art");
		trie.addWord("arts");
		//trie.addWord("articulate");
		//trie.addWord("artificial");
		//trie.addWord("arsenic");  
		trie.addWord("see");
		trie.addWord("sea");
		trie.addWord("seen");
		trie.addWord("bug");
		trie.addWord("boy");
		
		trie.display();
		//System.out.println(trie.searchWord("art"));
		trie.remove("seen");
		trie.remove("see");
		trie.remove("sea");
		System.out.println();
		//System.out.println(trie.getNumWords());
		//System.out.println(trie.searchWord("articulate"));
		trie.display();
		trie.displayAsATree();
	}
}

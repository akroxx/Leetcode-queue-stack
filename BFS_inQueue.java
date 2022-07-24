int BFS(Node root, Node target){
	Queue<Node> queue;

	int step = 0;

	// init
	queue.add(root);

	// BFS
	while(!queue.isEmpty()){
		int size = queue.size();
		for (int i = 0; i < size; i++){
			// First node assigned
			Node curr = queue.poll();
			if(curr == target)
				return step;
			for(Node next : curr.next){
				queue.add(next);
			}
			queue.poll();	//Removing root at end after adding all nodes next to current node i.e. root
		}
		step+=1;
	}
	// When no path from root to target is found
	return -1;
}
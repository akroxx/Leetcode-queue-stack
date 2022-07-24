int BFS(Node root, Node target){
	Queue<Node> queue;
	Set<Node> visited;

	int step = 0;

	// init
	queue.add(root);
	visited.add(root);

	// BFS
	while(!queue.isEmpty()){
		int size = queue.size();

		for(int i =0; i < size; i++){
			Node curr = queue.poll();
			if(curr == target)
				return step;
			for(Node next : curr.next){
				if(!visited.contains(next)){
					queue.add(next);
					visited.add(next);
				}
			}
			queue.poll();	//remove root for freshly added nodes
		}
		step+=1;	//Step increment after every level
	}
	return -1;	//No path found from root to target
}
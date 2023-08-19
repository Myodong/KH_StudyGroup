package test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test {


	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// 1. 첫째 줄에서 노드의 개수 N을 입력 받기
		int n = Integer.parseInt(br.readLine());

		// 트리 구조를 표현하기 위한 그래프 구현
		ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			tree.add(new ArrayList<>());
		}

		// 2. 노드 연결 정보 입력 받아 그래프 구성
		for (int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken()) - 1; // 노드 번호는 0부터 시작하므로 1 빼기
			int n2 = Integer.parseInt(st.nextToken()) - 1; // 노드 번호는 0부터 시작하므로 1 빼기
			tree.get(n1).add(n2); // 노드 n1과 n2를 연결
			tree.get(n2).add(n1); // 노드 n2와 n1을 연결 (양방향)
		}

		boolean[] visited = new boolean[n]; // 방문 여부 확인용 배열
		int[] parentNode = new int[n];      // 부모 노드 저장 배열

		// 3. BFS를 통해 부모 노드 찾기 레벨 0부터 끝까지 차례대로 순회
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0); // 시작 노드는 0 (루트 노드)
		visited[0] = true; // 시작 노드 방문 표시
		while (!queue.isEmpty()) {
			int v = queue.remove(); // 큐에서 노드를 하나 꺼내옴
			for (int node : tree.get(v)) { // 현재 노드의 연결된 모든 노드에 대해서
				if (!visited[node]) {
					visited[node] = true; // 방문 표시
					queue.add(node); // 큐에 추가하여 다음에 방문할 노드로 지정
					parentNode[node] = v; // 부모 노드를 현재 노드로 설정
				}
			}
		}

		// 4. 루트 노드를 제외한 모든 노드의 부모 노드 출력
		for (int i = 1; i < n; i++) {
			bw.write(parentNode[i] + 1+"\n"); // 노드 번호는 0부터 시작하므로 1 더하기
		}

		bw.close();
		br.close();
	}




}
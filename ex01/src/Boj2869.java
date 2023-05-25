import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2869 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int count = (V-A) / (A-B);
		
		while (true) {
			A += br.read();

			
			if (A >= V) {
				break;
			}
			count ++;
			
			System.out.println(count+1); 
			
		}
	}

}
	
	
	//			
//			for (int i = 0; i <V; i++) {
//				
//			}
//			count ++;
	
	
	
	
	
	
	
	
	
	
	



























/*
	public static void main(String[] args) 
	{

	int snail = 0;
	int count = 0;

		while (true)
		{
			snail += 3;                //3m 올라감
			count ++;                  // 하루 지남
		
				if (snail >= 13)        // 만약 13m 넘었는지
				{
					break;              // 안넘었다면 빠져나가지 x 다음 수행
				 }


			snail -= 1;                 // -1 미끄러짐
            // 마이너스 수식이 위에 있으면 안됨 (13m 올라왔는데 내려갈필요 x)

			System.out.println("snail = " + snail + " m ");
		}

		System.out.println("벗어나는 날 : " + count + " 일 ");

	}
	class while_3 
{
	public static void main(String[] args) 
	{

	int snail = 0;
	int count = 0;

		while (true)
		{
			snail += 3;                //3m 올라감
			count ++;                  // 하루 지남
		
				if (snail >= 13)        // 만약 13m 넘었는지
				{
					break;              // 안넘었다면 빠져나가지 x 다음 수행
				 }


			snail -= 1;                 // -1 미끄러짐
            // 마이너스 수식이 위에 있으면 안됨 (13m 올라왔는데 내려갈필요 x)

			System.out.println("snail = " + snail + " m ");
		}

		System.out.println("벗어나는 날 : " + count + " 일 ");

	}
}		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());

		long destination = V - B;
		long dist = A - B;

		long div = destination / dist;
		long mod = destination % dist;

		long day = div;
		if(mod != 0) {
			day = day + 1;
			System.out.println(day);
		}
		else {
			System.out.println(day);
		}

        int days = (v-a) / (a-b); // 달팽이가 정상에 오르기 전날까지의 날
        if((v - a) % (a-b) != 0) // 달팽이가 하루에 오르는 높이보다 정상까지의 높이가 짧을때
            days++;
        System.out.println(days+1); // 마지막날 오른 기록은 계산식에 포함되어있지 않으므로 출력에 1일을 더해준다.
    }
	}
}*/
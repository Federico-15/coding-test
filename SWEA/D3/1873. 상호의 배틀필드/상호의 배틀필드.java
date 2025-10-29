import java.util.Scanner;
import java.util.*;


// BOJ -> Main
// SWEA Solution
class Solution {

    // 현재 좌표
    static int current_x;
    static int current_y;

	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
		
        int T;

        T = sc.nextInt();
		        
		for(int test_case = 1; test_case <= T; test_case++){


        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] map = new char[H][W];

        char see = ' ';

        String str = new String();

            // map 입력받기
            for(int i = 0 ; i < H; i++){
                str = sc.next();
                for (int j = 0 ; j < W; j++){
                    map[i][j] = str.charAt(j);
                }
            }

            // 이동횟수
            int N = sc.nextInt();
            
            // 이동 명령
            String move = sc.next();

            // 현재 좌표 찾고 평지로 만들기, 보는 방향 설정
            for(int i = 0 ; i < H; i++){
                for (int j = 0 ; j < W; j++){
                    if(map[i][j] == '^'){
                        current_x = i;
                        current_y = j;
                        map[i][j] = '.';
                        see = '^';
                    } 

                    else if(map[i][j] == 'v'){
                        current_x = i;
                        current_y = j;
                        map[i][j] = '.';
                        see = 'v';
                    }

                    else if(map[i][j] == '<'){
                        current_x = i;
                        current_y = j;
                        map[i][j] = '.';
                        see = '<';
                    }

                    else if(map[i][j] == '>'){
                        current_x = i;
                        current_y = j;
                        map[i][j] = '.';
                        see = '>';
                    }
                    
                            
                    }
                }
            

            // 이동하기
            for(int i = 0; i < N; i++){
                
                // U : 전차가 바라보는 방향 위쪽으로 바꾸고, 평지라면 그 위로 이동
                if(move.charAt(i) == 'U'){
                    see = '^';

                    if(current_x - 1 >= 0 && map[current_x - 1][current_y] == '.'){
                        current_x--;
                    }
                }

                // D : 전차 바라보는 방향 아래쪽으로 바꾸고, 아래로 이동
                if(move.charAt(i) == 'D'){
                    see = 'v';

                    if(current_x + 1 < H && map[current_x + 1][current_y] == '.'){
                        current_x++;
                    }
                }

                // L : 전차 바라보는 방향 왼쪽으로 바꾸고, 좌로 이동
                if(move.charAt(i) == 'L'){
                    see = '<';

                    if(current_y-1 >= 0 && map[current_x][current_y - 1] == '.'){
                        current_y--;
                    }
                }

                // R : 전차 바라보는 방향 오른쪽으로 바꾸고, 우로 이동
                if(move.charAt(i) == 'R'){
                    see = '>';

                    if(current_y + 1 < W && map[current_x][current_y + 1] == '.'){
                        current_y++;
                    }
                }

                if(move.charAt(i) == 'S'){
                    if(see == '>'){
                        for(int j = current_y; j < W; j++){
                            if(map[current_x][j] == '*'){
                                map[current_x][j] = '.';
                                break;
                            }

                            else if(map[current_x][j] == '#'){
                                break;
                            }
                        }
                    }


                    else if(see == '<'){
                        for(int j = current_y; j >= 0; j--){
                            if(map[current_x][j] == '*'){
                                map[current_x][j] = '.';
                                break;
                            }
                            else if(map[current_x][j] == '#'){
                                break;
                            }
                        }
                    }

                    else if(see =='v'){
                            for(int j = current_x; j < H; j++){
                            if(map[j][current_y] == '*'){
                                map[j][current_y] = '.';
                                break;
                            }
                            
                            else if(map[j][current_y] == '#'){
                                break;
                            }
                        }
                    }

                    else if(see =='^'){
                        for(int j = current_x; j >= 0; j--){
                            if(map[j][current_y] == '*'){
                                map[j][current_y] = '.';
                                break;
                            }
                            else if(map[j][current_y] == '#'){
                                break;
                            }
                        }
                    }

                }

            }


            map[current_x][current_y] = see;

            System.out.print("#" + test_case + " ");
            for(int i = 0; i < H; i++){
                for(int j = 0; j < W; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
    }

			
    }

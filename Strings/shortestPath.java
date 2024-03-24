package Strings;

public class shortestPath {
    public static void main(String[] args) {
        String path = "ns";
        path = path.toUpperCase();
        System.out.println(getPath(path));
    }

    public static float getPath(String path ){
        int x = 0;
        int y = 0;
        for(int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            else if(dir == 'N'){
                y++;
            }
            //east
            else if (dir == 'E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }

        int  x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
}

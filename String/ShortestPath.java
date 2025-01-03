public class ShortestPath {
    
    public static float getShortestPath(String s) {
        
        int x=0,y=0;

        for(int i=0;i<s.length();i++) {
            char dir = s.charAt(i);

            if(dir=='S') {
                y--;
            }
            else if(dir == 'N') {
                y++;
            }
            else if(dir == 'W') {
                x--;
            }
            else if(dir == 'E') {
                x++;
            }
        }

        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);        

    }


    public static void main(String[] args) {
        String path = "WNEENESENNN";
        // String path = "NS";
        System.out.println(getShortestPath(path));    //5.0
    }
}

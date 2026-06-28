class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(x + "," + y);

        for(int i = 0; i<path.length();i++){
            char c = path.charAt(i);

            if(c == 'N') x++;
            else if(c == 'S') x--;
            else if(c == 'E') y++;
            else if(c == 'W') y--;
        
        String point = x + "," + y;
        if(set.contains(point)){
            return true;
        }
        set.add(point);
        }
        return false;
    }
}
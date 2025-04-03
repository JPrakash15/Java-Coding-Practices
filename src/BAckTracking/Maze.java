package BAckTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countPath(3,3));
        findPath("",3,3);
        System.out.println(findPathReturn("",3,4));
        System.out.println(countPathDiagnol(3,3));
        System.out.println(findPathDiagnolReturn("",3,3));
        boolean[][] maze={
                {true,true,false},
                {true,true,true},
                {false,true,true},
        };
        findPathObstacle("",maze, 0, 0);
        System.out.println(findPathObstacleReturn("",maze,0,0));
        System.out.println(findPathDiagnolObstacleReturn("",maze,0,0));
    }
    //    Q:find the no of paths
    static int countPath(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left=countPath(r-1,c);
        int  right=countPath(r,c-1);
        return left+right;
    }

//    Q:find the path
    static void findPath(String p,int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if(r>1){
            findPath(p+'D',r-1,c);
        }
        if(c>1){
            findPath(p+"R",r,c-1);
        }

    }
    //    Q:find the path
    static ArrayList<String> findPathReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(findPathReturn(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(findPathReturn(p+"R",r,c-1));
        }
        return list;
    }

    static int countPathDiagnol(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left=countPathDiagnol( r-1,c);
        int right=countPathDiagnol( r,c-1);
        int diagnol=countPathDiagnol( r-1,c-1);
        return left+right+diagnol;
    }

    static ArrayList<String> findPathDiagnolReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(findPathDiagnolReturn(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(findPathDiagnolReturn(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(findPathDiagnolReturn(p+"H",r,c-1));
        }
        return list;
    }

    static void findPathObstacle(String p,boolean[][] maze,int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            findPathObstacle(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            findPathObstacle(p+"R",maze,r,c+1);
        }
    }

    static ArrayList<String> findPathObstacleReturn(String p,boolean[][] maze,int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(!maze[r][c]){
            return list;
        }
        if(r<maze.length-1){
            list.addAll(findPathObstacleReturn(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(findPathObstacleReturn(p+"R",maze,r,c+1));
        }
        return list;
    }

    static ArrayList<String> findPathDiagnolObstacleReturn(String p, boolean[][] maze, int r, int c){
        if(r== maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(!maze[r][c]){
            return list;
        }
        if(r< maze.length-1){
            list.addAll(findPathDiagnolObstacleReturn(p+"H",maze,r+1,c));
        }
        if (c<maze[0].length-1){
            list.addAll(findPathDiagnolObstacleReturn(p+"V",maze,r,c+1));
        }
        if(r< maze.length-1 && c<maze[0].length-1){
            list.addAll(findPathDiagnolObstacleReturn(p+"D",maze,r+1,c+1));
        }
        return list;
    }
}
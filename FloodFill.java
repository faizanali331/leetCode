class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int c = image[sr][sc];
        if(c!=color){
            floodFillMethod(image, sr, sc, color, c);
        }
        return image;
    }
    public void floodFillMethod(int[][] image, int sr, int sc, int color, int c){

        if((sc<0||sc==image[0].length) || (sr<0||sr==image.length)){
            return;
        }
        if(image[sr][sc]!=c) return;

        image[sr][sc]=color;


        floodFillMethod(image, sr-1, sc, color, c);
        floodFillMethod(image, sr+1, sc, color, c);
        floodFillMethod(image, sr, sc-1, color, c);
        floodFillMethod(image, sr, sc+1, color, c);

    }

}
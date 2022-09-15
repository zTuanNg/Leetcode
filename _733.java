public class _733 {
    public static void main(String[] args) {

    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {


        int preColor = image[sr][sc];
        DFS(image, sr, sc, color, preColor);
        return image;
    }

    public static void DFS(int[][] image, int i, int j, int color, int preColor){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] == color || image[i][j] != preColor)
            return;
        image[i][j] = color;

        DFS(image, i, j+1, color, preColor);
        DFS(image, i, j-1, color, preColor);
        DFS(image, i + 1, j, color, preColor);
        DFS(image, i-1, j, color, preColor);

    }


}

public class LightBoard{
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for (int r = 0; r <numRows; r++){
            for (int c = 0; c <numCols; c++){
                double ran = Math.random();
                lights[r][c] = ran < 0.4;
            }
        }
    }
    public boolean evaluateLight(int row, int col){
        int numOn = 0;
        for (int r = 0; r < lights.length; r++){
            if (lights[r][col] == true) numOn++;
        }
        if (lights[row][col]== true && numOn % 2 == 0){
            return false;
        }
        if (lights[row][col] == false && numOn % 3 == 0){
            return false;
        }
        return lights[row][col];
    }

    public double test(){
        double on = 0;
        for (boolean[] row: lights){
            for (boolean b: row) {
                if (b) on++;
            }
        }
        return (on / lights.length * lights[0].length);
    }
    public void setLights(boolean[][] arr){
        lights = arr;
    }
}
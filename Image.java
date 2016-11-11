public abstract class Image
{
    // ---------------------
    // Image attributes
    // ---------------------
    protected String magic;
    protected int width;
    protected int height;
    protected int depth;

    // Accessors: getMagic(), getWidth(), etc...

    // Modifiers: setMagic(string m), setWidth(int w), etc...

    public abstract void flip_horizontally();
    public abstract void flip_vertically();
    public abstract void rotate_right_90();

    PGM pgm = new PGM("input.pgm"); 
    int[][] = pgm.getPixels();  
    pgm.flip_vertically(); 
    pgm.flip_horizontally();    
    pgm.rotate_right_90();
}
    public class Patterns 
    {



    public char[][] gliderArray = {{' ','*',' '},
                                   {' ',' ','*'},
                                   {'*','*','*'}};
                                 


    public char[][] getGlider()
    {
        return gliderArray;
    }

    public char[][] toadArray = {{' ','*','*','*'},
                                   {'*','*','*',' '},
                                   {' ',' ',' ',' '}};

    public char[][] getToad()
    {
        return toadArray;
    }


    public char[][] blinkerArray = {{' ',' ',' '},
                                   {'*','*','*'},
                                   {' ',' ',' '}};

    public char[][] getBlinker()
    {
        return blinkerArray;
    }

    public char[][] exploderArray = {{' ','*',' '},
                                   {'*','*','*'},
                                   {'*',' ','*'},
                                   {' ','*',' '}};

    public char[][] getExploder()
    {
        return exploderArray;
    }

    public char[][] blockArray = {{' ','*','*'},
                                   {' ','*','*'},
                                   {' ',' ',' '}};

    public char[][] getBlock()
    {
        return blockArray;
    }

    }
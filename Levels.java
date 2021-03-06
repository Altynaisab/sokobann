class Levels {
    int countLevel;
    Levels() {
    	countLevel = 1;
    }
    public int[][] nextLevel() {
	int[][] newDesktop = null;
    	switch(countLevel) {
    		case 1:
			newDesktop = level1();
		break;
    		case 2:
			newDesktop = level2();
		break;
    		case 3:
			newDesktop = level3();
		break;
    		case 4:
			newDesktop = level4();
		break;
    		case 5:
			newDesktop = level5();
		break;
	}
		countLevel++;
		return newDesktop;
    }

    public int[][] level1() {
	int[][] array = new int[][] {
			      {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
				    {2, 4, 2, 0, 0, 4, 2, 0, 0, 2},
				    {2, 0, 2, 0, 0, 2, 2, 0, 0, 2},
				    {2, 0, 3, 0, 0, 0, 3, 0, 0, 2},
				    {2, 0, 0, 0, 0, 2, 2, 0, 0, 2},
				    {2, 0, 0, 0, 0, 2, 2, 3, 0, 2},
				    {2, 4, 2, 0, 0, 0, 0, 0, 0, 2},
				    {2, 2, 2, 0, 0, 0, 2, 3, 0, 2},
				    {2, 4, 0, 0, 0, 0, 2, 0, 1, 2},
				    {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
				    };

    return array;
    }

    public int[][] level2() {
	int[][] array = new int[][] {
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            {2, 0, 0, 0, 0, 0, 0, 4, 4, 2},
            {2, 0, 3, 0, 0, 0, 0, 2, 0, 2},
            {2, 1, 0, 0, 2, 2, 2, 2, 0, 2},
            {2, 0, 0, 0, 2, 2, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 3, 0, 2},
            {2, 0, 0, 3, 0, 0, 0, 0, 2, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 4, 0, 2},
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},

					      };
    return array;
    }

    public int[][] level3() {
	int[][] array = new int[][] {
              {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
              {2, 2, 2, 0, 0, 0, 2, 0, 0, 2},
              {2, 4, 1, 3, 0, 0, 2, 0, 0, 2},
              {2, 2, 2, 0, 3, 4, 2, 0, 0, 2},
              {2, 4, 2, 2, 3, 0, 2, 0, 0, 2},
              {2, 0, 2, 0, 4, 0, 2, 0, 0, 2},
              {2, 3, 0, 0, 3, 0, 2, 0, 0, 2},
              {2, 0, 0, 0, 4, 3, 4, 0, 0, 2},
              {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
              {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},

				       };
    return array;
    }

    public int[][] level4() {
	int[][] array = new int[][] {
               {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
               {2, 0, 0, 0, 2, 0, 2, 2, 2, 2},
               {2, 0, 0, 0, 2, 0, 2, 4, 2, 2},
               {2, 0, 3, 0, 2, 0, 2, 4, 2, 2},
               {2, 2, 2, 0, 2, 2, 2, 0, 2, 2},
               {2, 2, 2, 0, 0, 1, 3, 0, 2, 2},
               {2, 2, 2, 0, 0, 2, 0, 0, 2, 2},
               {2, 0, 0, 0, 0, 2, 0, 0, 2, 2},
               {2, 0, 0, 0, 0, 2, 0, 0, 2, 2},
               {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},

					      };
    return array;
    }
    public int[][] level5() {
	int[][] array = new int[][] {
                   {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                   {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                   {2, 2, 2, 2, 2, 2, 2, 2, 0, 2},
                   {2, 2, 0, 0, 0, 0, 0, 2, 0, 2},
                   {2, 2, 0, 0, 0, 0, 0, 2, 2, 2},
                   {2, 2, 0, 2, 2, 2, 0, 3, 0, 2},
                   {2, 0, 0, 1, 0, 3, 0, 0, 0, 2},
                   {2, 0, 4, 2, 2, 0, 3, 0, 0, 2},
                   {2, 0, 4, 4, 2, 0, 0, 0, 0, 2},
                   {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},

                                        };
    return array;
    }
}

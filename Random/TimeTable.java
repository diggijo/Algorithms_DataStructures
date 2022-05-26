package Random;

import java.util.Arrays;

public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9;
    private String[][] grid;

    public TimeTable()
    {
        grid = new String[HOURS][DAYS];
        // Fill with empty string
        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                grid[row][col] = "";
            }
        }
    }

    public void set(int hour, int day, String moduleName)
    {
        grid[hour][day] = moduleName;
    }

    public String get(int hour, int day)
    {
        return grid[hour][day];
    }

    public int countFreeSlots() {
        //count the number of empty slots in the grid
        int freeSlots=0;

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                if(grid[row][col] == "")
                {
                    freeSlots++;
                }
            }
        }

        return freeSlots;
    }

    public int count(String moduleName) {
        // count the number of occurrences of moduleName in the grid
        int numModuleOccurences=0;

        for (int row = 0; row < HOURS; row++)
        {
            for (int col = 0; col < DAYS; col++)
            {
                if(grid[row][col] == moduleName)
                {
                    numModuleOccurences++;
                }
            }
        }

        return numModuleOccurences;
    }

    public int[] countDailyFreeSlots() {
        int[] days = new int[5];

        for (int row = 0; row < DAYS; row++)
        {
            for (int col = 0; col < HOURS; col++)
            {
                if(grid[row][col] == "")
                {
                    days[row]++;
                }
            }
        }

        return days;
    }

    public static void main(String[] args) {

    }
}

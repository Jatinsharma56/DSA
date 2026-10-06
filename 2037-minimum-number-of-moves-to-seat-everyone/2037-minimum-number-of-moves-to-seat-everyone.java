class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int max=0;
        for(int i=0;i<seats.length;i++){
            max+=Math.abs(seats[i]-students[i]);

        }
        return max;
        
    }
}
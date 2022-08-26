package Course2_Module5;

public class Code1 {
   public static void main(String args[]) {
            int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
            int userWithMostVotes = mostVotes(votes);
            System.out.println("User with the most votes is User: " + userWithMostVotes);
        }
        public static int mostVotes(int[] votesPerUser) {
            // write the logic of function mostVotes() here.
            int max = votesPerUser[0];
            int mostVotes = 0;
            for (int i = 1; i < votesPerUser.length; i++)
                if (votesPerUser[i] > max) {
                    max = votesPerUser[i];
                    mostVotes = i;
                }
                    
            return mostVotes;
        }
    }

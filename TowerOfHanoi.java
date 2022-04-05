public class TowerOfHanoi {
        static void towerofhanoi(int n, char from, char dest, char aux){
            if(n==1){
                System.out.println("Moving disc 1 from tower "+from+" to tower "+dest);
                return;
            }
            towerofhanoi(n-1,from,aux,dest);
            System.out.println("Moving disc 1 from tower "+from+" to tower "+dest);
            towerofhanoi(n-1,aux,dest,from);
    
        }
        public static void main(String[] args){
            int n=3;
            towerofhanoi(n,'A','C','B');
        }
        
    }


package instagramideas;

public class EleventhIdea {
    public static void main(String[] args) {
        Object obj = new int[]{1,2,3};
        int[] someArray = (int[]) obj;
        for(int i : someArray){
            System.out.println(i +" ");
        }
    }
}
